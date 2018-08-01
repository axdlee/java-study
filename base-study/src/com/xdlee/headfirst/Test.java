package com.xdlee.headfirst;

import java.util.Scanner;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-23
 * Time: 下午7:52
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.xdlee.com
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("next line 方式接收");
        if (scanner.hasNextLine()) {
            String str1 = scanner.nextLine();
            System.out.println("输入数据为：" + str1);
        }
    }
}
