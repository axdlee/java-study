package com.yeelight.headfirst;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-24
 * Time: 下午4:58
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        integerBox.add(new Integer(10));
        stringBox.add(new String("hello"));

        System.out.printf("整数型为 %d\n\n", integerBox.get());
        System.out.printf("字符串类型为： %s\n\n", stringBox.get());
    }
}
