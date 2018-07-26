package com.xdlee.how2j.junior;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午4:18
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class GiantDragon {
    /**
     * 设置构造函数私有，使该类无法被实例化
     */
    private GiantDragon() {

    }

    private static GiantDragon instance;

    public static GiantDragon getInstance() {
        if (instance == null) {
            instance = new GiantDragon();
        }
        return instance;
    }
}
