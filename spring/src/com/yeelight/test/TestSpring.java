package com.yeelight.test;

import com.yeelight.pojo.Category;
import com.yeelight.pojo.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-31
 * Time: 下午5:23
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class TestSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
                "applicationContext.xml"
        });

        Category c = (Category) context.getBean("c");
        System.out.println(c.getName());

        Product p = (Product) context.getBean("p");
        System.out.println(p.getCategory().getName());

    }
}
