import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.rmi.ServerException;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-30
 * Time: 下午3:37
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class LoginServlet extends HttpServlet {
    public LoginServlet() {
        System.out.println("LoginServlet 被调用了");
    }

    @Override
    public void init(ServletConfig config) {
        System.out.println("init(ServletConfig)");
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String name = request.getParameter("name");
            String password = request.getParameter("password");

            System.out.println("浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有): " + request.getRequestURL());
            System.out.println("浏览器发出请求的资源名部分，去掉了协议和主机名: " + request.getRequestURI());
            System.out.println("请求行中的参数部分: " + request.getQueryString());
            System.out.println("浏览器所处于的客户机的IP地址: " + request.getRemoteAddr());
            System.out.println("浏览器所处于的客户机的主机名: " + request.getRemoteHost());
            System.out.println("浏览器所处于的客户机使用的网络端口: " + request.getRemotePort());
            System.out.println("服务器的IP地址: " + request.getLocalAddr());
            System.out.println("服务器的主机名: " + request.getLocalName());
            System.out.println("得到客户机请求方式: " + request.getMethod());

            String html = null;

            if ("admin".equals(name) && "admin".equals(password)) {
                request.getRequestDispatcher("success.html").forward(request, response);
            } else {
                //response.sendRedirect("fail.html");
                response.setStatus(301);
                response.setHeader("Location", "fail.html");
            }
            response.setContentType("text/html; charset=UTF-8");
            PrintWriter pw = response.getWriter();
            pw.println(html);

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy()");
    }
}
