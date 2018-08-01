package com.xdlee.how2j.junior;

import java.util.Arrays;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午2:55
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class ArraysTest {
    public static void main(String[] args) {
        int a[] = new int[]{18, 62, 68, 82, 58, 9};

        int b[] = Arrays.copyOfRange(a, 0, 3);

        Arrays.sort(a);

        String content = Arrays.toString(a);

        System.out.println(content);

        System.out.println("数字62出现的位置是:" + Arrays.binarySearch(a, 62));

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
