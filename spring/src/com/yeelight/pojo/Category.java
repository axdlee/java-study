package com.yeelight.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-31
 * Time: 下午5:21
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
@Component("c")
public class Category {
    int id;
    String name = "category1";

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
