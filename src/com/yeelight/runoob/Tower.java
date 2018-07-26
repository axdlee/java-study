package com.yeelight.runoob;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 上午11:01
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class Tower {
    private static int counter = 0;

    public static void main(String[] args) {
        int nDisks = 4;
        doTowers(nDisks, 'A', 'B', 'C');
        System.out.printf("Finished in %d steps!", counter);
    }

    public static void doTowers(int topN, char from, char inner, char to) {
        counter++;
        if (topN == 1) {
            System.out.println("Disk 1 from" + from + " to " + to);
        } else {
            doTowers(topN - 1, from, to, inner);
            System.out.println("Disk" + topN + " from " + from + " to " + to);
            doTowers(topN -1, inner, from, to);
        }
    }
}
