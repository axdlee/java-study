package com.yeelight.headfirst;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 上午9:49
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class DisplayMessage implements Runnable {
    private String message;

    public DisplayMessage(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(message);
        }
    }
}
