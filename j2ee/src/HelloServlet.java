import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-30
 * Time: 下午3:21
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class HelloServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config){
        System.out.println("init of Hello Servlet");
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String header = headerNames.nextElement();
            String value = request.getHeader(header);
            System.out.printf("%s\t%s%n",header,value);
        }
        try {
            response.setDateHeader("Expires", 0);
            response.setHeader("Cache-Control", "no-cache");
            response.setHeader("pragma", "no-cache");
            response.setContentType("text/html; charset=UTF-8");
            response.getWriter().println("<h1>Hello Servlet</h1>");
            response.getWriter().println(new Date().toLocaleString());

            //response.setContentType("text/lol");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
