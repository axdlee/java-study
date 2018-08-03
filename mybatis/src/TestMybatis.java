import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yeelight.pojo.Category;
import com.yeelight.pojo.Order;
import com.yeelight.pojo.OrderItem;
import com.yeelight.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-2
 * Time: 上午9:51
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class TestMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session=sqlSessionFactory.openSession();

        /*List<Category> cs=session.selectList("listCategory");
        for (Category c : cs) {
            System.out.println(c.getName());
        }*/

        /*// 添加
        Category c = new Category();
        c.setName("新增的分类");
        session.insert("addCategory", c);*/

        /*// 删除
        Category c = new Category();
        c.setId(3);
        session.delete("deleteCategory", c);*/

        /*// 获取
        Category c = session.selectOne("getCategory", 2);
        System.out.println(c.getName());*/

        /*// 修改
        Category c = session.selectOne("getCategory", 2);
        c.setName("修改过的fenlei");
        session.update("updateCategory", c);*/

        /*// 模糊查询
        List<Category> cs = session.selectList("listCategoryByName", "cat");
        for (Category c:cs
             ) {
            System.out.println(c.getName());
        }*/

        /*// 多条件查询
        Map<String, Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "cat");
        List<Category> cs = session.selectList("listCategoryByIdAndName", map);

        for (Category c:cs
             ) {
            System.out.println(c.getName());
        }*/

        /*// 一对多
        List<Category> cs = session.selectList("listCategoryAndProduct");
        for (Category c:cs
             ) {
            System.out.println(c);
            List<Product> ps = c.getProducts();
            for (Product p:ps
                 ) {
                System.out.println("\t" + p);
            }
        }*/

        /*// 多对一
        List<Product> ps = session.selectList("listProduct");

        for (Product p:ps
             ) {
            System.out.println(p + " 对应的分类是：\t" + p.getCategory());
        }*/

        // 多对多
        List<Order> os = session.selectList("listOrder");
        for (Order o : os) {
            System.out.println(o.getCode());
            List<OrderItem> ois= o.getOrderItems();
            for (OrderItem oi : ois) {
                System.out.format("\t%s\t%f\t%d%n", oi.getProduct().getName(),oi.getProduct().getPrice(),oi.getNumber());
            }
        }

        //listAll(session);

        session.commit();
        session.close();
    }

    public static void listAll(SqlSession session) {
        List<Category> cs = session.selectList("listCategory");
        for (Category c: cs
             ) {
            System.out.println(c.getName());
        }
    }
}
