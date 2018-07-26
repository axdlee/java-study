package com.xdlee.runoob;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午2:02
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.xdlee.com
 */
public class Diamond {
    public static void main(String[] args) {
        // 输出8行的菱形
        print(8);
    }

    public static void print(int size) {
        if (size % 2 == 0) {
            size ++; // 计算菱形大小
        }
        for (int i = 0; i < size / 2 + 1; i++) {
            for (int j = size / 2 + 1; j > i + 1; j--) {
                // 输出左上角位置的空白
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                // 输出菱形上半部边缘
                System.out.print("*");
            }
            System.out.println(); // 输出换行
        }
        for (int i = size / 2 + 1; i < size; i++) {
            for (int j = 0; j < i - size / 2; j++) {
                // 输出菱形左下角空白
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * size - 1 - 2 * i; j++) {
                // 输出菱形下半部边缘
                System.out.print("*");
            }
            System.out.println(); // 换行
        }
    }
}
