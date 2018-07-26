package com.xdlee.runoob;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午2:39
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.xdlee.com
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " X " + j + " = " + i*j + "\t");
            }
            System.out.println();
        }
    }
}
