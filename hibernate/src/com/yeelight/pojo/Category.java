package com.yeelight.pojo;

import java.util.Set;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-31
 * Time: 下午2:59
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class Category {
    int id;
    String name;
    Set<Product> products;

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
