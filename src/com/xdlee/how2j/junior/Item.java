package com.xdlee.how2j.junior;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午1:37
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class Item {
    // 名字
    String name;

    // 价格
    int price;

    public static void main(String[] args) {
        // 血瓶
        Item bloodBottle = new Item();
        bloodBottle.name = "血瓶";
        bloodBottle.price = 50;

        // 草鞋
        Item sandals = new Item();
        sandals.name = "草鞋";
        sandals.price = 300;

        // 长剑
        Item longSward = new Item();
        longSward.name = "长剑";
        longSward.price = 350;
    }
}
