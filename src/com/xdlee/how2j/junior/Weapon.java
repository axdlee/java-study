package com.xdlee.how2j.junior;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午3:13
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class Weapon extends Item {
    int damage;

    public static void main(String[] args) {
        Weapon infinityEdge = new Weapon();

        infinityEdge.damage = 65;
        infinityEdge.name = "无尽之刃";
        infinityEdge.price = 3600;
    }
}
