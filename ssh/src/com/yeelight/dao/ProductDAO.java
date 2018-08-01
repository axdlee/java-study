package com.yeelight.dao;

import com.yeelight.pojo.Product;

import java.util.List;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-1
 * Time: 下午1:46
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public interface ProductDAO {
    public List<Product> list();

    public void add(Product product);
}
