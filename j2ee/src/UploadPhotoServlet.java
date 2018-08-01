import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-30
 * Time: 下午4:23
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class UploadPhotoServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        String fileName = null;
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        factory.setSizeThreshold(1024 * 1024);
        List items = null;
        try{
            items = upload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

        Iterator iter = items.iterator();
        while (iter.hasNext()) {
            FileItem item = (FileItem) iter.next();
            if (!item.isFormField()) {
                fileName = System.currentTimeMillis() + ".jpg";
                String uploadPath = request.getServletContext().getRealPath("uploaded");
                File f = new File(uploadPath, fileName);
                f.getParentFile().mkdirs();
                InputStream in = null;
                try {
                    in = item.getInputStream();
                    FileOutputStream fos = new FileOutputStream(f);
                    byte[] b = new byte[1024 * 1024];
                    int length = 0;
                    while (-1 != (length = in.read(b))) {
                        fos.write(b, 0, length);
                    }
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println(item.getFieldName());
                String value = item.getString();
                try {
                    value = new String(value.getBytes("ISO-8859-1"), "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                System.out.println(value);
            }
        }

        String html = "<img width='200' height='150' src='uploaded/%s' />";
        response.setContentType("text/html");
        PrintWriter pw= null;
        try {
            pw = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }

        pw.format(html, fileName);
    }
}
