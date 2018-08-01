package com.yeelight.service.impl;

import com.yeelight.dao.ProductDAO;
import com.yeelight.pojo.Product;
import com.yeelight.service.ProductService;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-1
 * Time: 下午1:54
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class ProductServiceImpl implements ProductService {
    ProductDAO productDAO;

    @Override
    public List<Product> list() {
        List<Product> products = productDAO.list();
        if (products.isEmpty()) {
            for (int i = 0; i < 5; i++) {
                Product product = new Product();
                product.setName("product" + i);
                products.add(product);
                productDAO.add(product);
            }
        }
        return products;
    }

    public ProductDAO getProductDAO() {
        return productDAO;
    }

    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }
}
