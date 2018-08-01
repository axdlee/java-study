package com.yeelight.pojo;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-1
 * Time: 上午10:08
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@Component("p")
public class Product {
    private int id;
    private String name = "product 1";

    @Resource(name = "c")
    private Category category;

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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
