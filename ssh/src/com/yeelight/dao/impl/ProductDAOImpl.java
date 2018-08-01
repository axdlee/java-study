package com.yeelight.dao.impl;

import com.yeelight.dao.ProductDAO;
import com.yeelight.pojo.Product;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-1
 * Time: 下午1:49
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class ProductDAOImpl extends HibernateTemplate implements ProductDAO {
    @Override
    public List<Product> list() {
        return find("from Product");
    }

    @Override
    public void add(Product product) {
        save(product);
    }
}
