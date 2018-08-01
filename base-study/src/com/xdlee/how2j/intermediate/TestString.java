package com.xdlee.how2j.intermediate;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-30
 * Time: 上午10:57
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class TestString {
    public static void main(String[] args) {
        String str1 = "yeelight";
        String str2 = new String("yeelight");
        String str3 = "yeelight";
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str1.equals(str2));
    }
}
