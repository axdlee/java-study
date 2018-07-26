package com.xdlee.how2j.junior;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午3:18
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class Armor extends Item {
    /**
     * 护甲等级
     */
    int ac;

    public static void main(String[] args) {
        Armor bujia = new Armor();
        bujia.name = "布甲";
        bujia.ac = 15;

        Armor suozijia = new Armor();
        suozijia.name = "锁子甲";
        suozijia.ac = 40;
    }
}
