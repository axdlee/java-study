package com.yeelight.springboot.pojo;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-7
 * Time: 下午2:35
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class Product {
    private int id;
    private String name;
    private int price;

    public Product(int id,String name,int price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
