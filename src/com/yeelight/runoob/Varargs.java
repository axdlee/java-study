package com.yeelight.runoob;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午1:55
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class Varargs {
    public static void main(String[] args) {
        int sum = 0;
        int[] intArrays = {10, 12, 23};
        sum = sumvarargs(intArrays);
        System.out.println("数字相加之和为：" + sum);
    }

    public static int sumvarargs(int ... intArrays) {
        int sum, i;
        sum = 0;
        for (i = 0; i < intArrays.length; i++) {
            sum += intArrays[i];
        }

        return (sum);
    }
}
