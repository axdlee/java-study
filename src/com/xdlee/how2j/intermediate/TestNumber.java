package com.xdlee.how2j.intermediate;

import java.util.Locale;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-30
 * Time: 上午10:38
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class TestNumber {
    public static void main(String[] args) {
        float f1 = 5.4f;
        float f2 = 5.5f;

        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 10));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.PI);
        System.out.println(Math.E);

        int year = 2020;
        System.out.printf("%d%n", year);
        System.out.printf("%8d%n", year);
        System.out.printf("%-8d%n", year);
        System.out.printf("%08d%n", year);
        System.out.printf("%,8d%n", year * 1000);
        //小数点位数
        System.out.format("%.2f%n",Math.PI);

        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.CHINA,"%,.2f%n",Math.PI*10000);
    }
}
