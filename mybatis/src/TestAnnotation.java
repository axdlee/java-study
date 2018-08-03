import com.yeelight.mapper.CategoryMapper;
import com.yeelight.mapper.OrderMapper;
import com.yeelight.mapper.ProductMapper;
import com.yeelight.pojo.Category;
import com.yeelight.pojo.Order;
import com.yeelight.pojo.OrderItem;
import com.yeelight.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-3
 * Time: 下午4:44
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class TestAnnotation {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();

        CategoryMapper mapper = session.getMapper(CategoryMapper.class);
        ProductMapper mapper1 = session.getMapper(ProductMapper.class);

        //listAll(mapper);

        /*List<Product> ps= mapper1.list();
        for (Product p : ps) {
            System.out.println(p + "\t对应的分类是:\t" + p.getCategory().getName());
        }*/

        // 多对多
        OrderMapper mapper3 = session.getMapper(OrderMapper.class);
        List<Order> os = mapper3.list();
        for (Order o : os) {
            System.out.println(o.getCode());
            List<OrderItem> ois= o.getOrderItems();
            if(null!=ois){
                for (OrderItem oi : ois) {
                    System.out.format("\t%s\t%f\t%d%n", oi.getProduct().getName(),oi.getProduct().getPrice(),oi.getNumber());
                }
            }

        }

        session.commit();
        session.close();

    }

    private static void add(CategoryMapper mapper) {
        Category c = new Category();
        c.setName("新增加的category");
        mapper.add(c);
        listAll(mapper);
    }

    private static void delete(CategoryMapper mapper) {
        mapper.delete(2);
        listAll(mapper);
    }

    private static void get(CategoryMapper mapper) {
        mapper.get(1);
        listAll(mapper);
    }

    private static void update(CategoryMapper mapper) {
        Category c = mapper.get(1);
        c.setName("修改了的category");
        mapper.update(c);
        listAll(mapper);
    }

    private static void listAll(CategoryMapper mapper) {
        List<Category> cs = mapper.list();
        for (Category c:cs
             ) {
            System.out.println(c.getName());
            List<Product> ps = c.getProducts();
            for (Product p:ps
                 ) {
                System.out.println("\t"+p.getName());
            }
        }
    }
}
