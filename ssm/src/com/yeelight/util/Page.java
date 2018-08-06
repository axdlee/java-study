package com.yeelight.util;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-8-6
 * Time: 上午10:29
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class Page {
    int start = 0;
    int count = 5;
    int last = 0;

    public void caculateLast(int total) {
        // 假设总数是50，能够被5整除的，那么最后一页开始就是45
        if (total % count == 0) {
            last = total - count;
        } else {
            last = total - total % count;
        }
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getLast() {
        return last;
    }

    public void setLast(int last) {
        this.last = last;
    }
}
