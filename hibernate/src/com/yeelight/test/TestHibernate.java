package com.yeelight.test;

import com.yeelight.pojo.Category;
import com.yeelight.pojo.Product;
import com.yeelight.pojo.User;
import org.hibernate.Cache;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-31
 * Time: 下午2:42
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class TestHibernate {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        Session s = sf.openSession();
        Session s1 = sf.openSession();
        s.beginTransaction();
        s1.beginTransaction();

        /*for (int i = 0; i < 10; i++) {
            Product p = new Product();
            p.setName("iphone"+i);
            p.setPrice(i);
            s.save(p);
        }*/

        /*Product p = (Product) s.get(Product.class, 5);
        System.out.println("id=5的产品名称是：" + p.getName());
        //s.delete(p);
        p.setName("iphone-modified");
        s.update(p);*/

        /*String name = "iphone";
        Query q = s.createQuery("from Product p where p.name like ?");
        q.setString(0, "%" + name + "%");
        List<Product> lists = q.list();
        for (Product p: lists
             ) {
            System.out.println(p.getName());
        }*/

        /*Category category = new Category();
        category.setName("c1");
        s.save(category);

        Product p = (Product) s.get(Product.class, 5);
        p.setCategory(category);
        s.update(p);*/

        /*Category c = (Category) s.get(Category.class, 1);
        Set<Product> ps = c.getProducts();
        for (Product p: ps
             ) {
            System.out.println(p.getName());
        }*/

        /*// 增加三个用户
        Set<User> users = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            User u = new User();
            u.setName("user" + i);
            users.add(u);
            s.save(u);
        }

        // 产品1被用户1,2,3购买
        Product p = (Product) s.get(Product.class, 1);
        p.setUsers(users);
        s.save(p);*/

        /*Product p = (Product) s.load(Product.class, 1);
        System.out.println("log1");
        System.out.println(p.getName());
        System.out.println("log2");*/

        /*String name = "iphone";
        Query q = s.createQuery("from Product p where p.name like ?");
        q.setString(0, "%" + name + "%");

        Iterator<Product> it = q.iterate();

        while (it.hasNext()) {
            Product p = it.next();
            System.out.println(p.getName());
        }*/

        /*String name = "iphone";
        Query q = s.createQuery("select count(*) from Product p where p.name like ?");
        q.setString(0, "%" + name + "%");
        long total = (Long) q.uniqueResult();
        System.out.println(total);*/

        Product p1 = (Product) s.get(Product.class, 1);
        System.out.println("产品原本价格是: " + p1.getPrice());
        p1.setPrice(p1.getPrice() + 1000);

        Product p2 = (Product) s1.get(Product.class, 1);
        p2.setPrice(p2.getPrice() + 1000);

        s.update(p1);
        s1.update(p2);

        s.getTransaction().commit();
        s1.getTransaction().commit();
        s.close();
        s1.close();
        sf.close();
    }
}
