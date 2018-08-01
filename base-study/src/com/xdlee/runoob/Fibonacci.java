package com.xdlee.runoob;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 上午11:11
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.xdlee.com
 */
public class Fibonacci {
    public static void main(String[] args) {
        for (int counter = 0; counter < 40; counter++) {
            System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
        }
    }

    public static long fibonacci(long number) {
        if (number == 0 || number == 1) {
            return number;
        }
        return fibonacci(number - 1) + fibonacci(number -2);
    }
}
