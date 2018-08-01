import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-30
 * Time: 下午4:07
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("获取单值参数 name:" + request.getParameter("name"));
        String[] hobits = request.getParameterValues("hobits");
        System.out.println("获取多值参数 hobits :" + Arrays.asList(hobits));

        System.out.println("获取所有参数。。");
        Map<String, String[]> parameters = request.getParameterMap();
        Set<String> parameterNames = parameters.keySet();
        for (String param : parameterNames) {
            String[] values = parameters.get(param);
            System.out.println(param + ":" + Arrays.asList(values));
        }
    }
}
