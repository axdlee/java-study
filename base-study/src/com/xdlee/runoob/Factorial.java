package com.xdlee.runoob;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 上午11:18
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.xdlee.com
 */
public class Factorial {
    public static void main(String[] args) {
        for (int counter = 0; counter < 20; counter++) {
            System.out.printf("%d! = %d\n", counter, factorial(counter));
        }
    }

    public static long factorial(long number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
