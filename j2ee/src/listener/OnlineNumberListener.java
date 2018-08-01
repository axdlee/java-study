package listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-31
 * Time: 上午10:52
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class OnlineNumberListener implements HttpSessionListener {
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext application = httpSessionEvent.getSession().getServletContext();

        Integer online_number = (Integer) application.getAttribute("online_number");

        if (online_number == null) {
            online_number = 0;
        }
        online_number++;
        application.setAttribute("online_number", online_number);
        System.out.println("新增一位在线用户");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext application = httpSessionEvent.getSession().getServletContext();

        Integer online_number = (Integer) application.getAttribute("online_number");

        if (online_number == null) {
            online_number = 0;
        }
        online_number--;
        application.setAttribute("online_number", online_number);
        System.out.println("一位用户离线");
    }
}
