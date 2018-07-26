package com.xdlee.headfirst;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 上午9:54
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.xdlee.com
 */
public class GuessANumber extends Thread {
    private int number;

    public GuessANumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        int counter = 0;
        int guess = 0;
        do {
            guess = (int) (Math.random() * 100 + 1);
            System.out.println(this.getName() + "guesses" + guess);
            counter++;
        } while (guess != number);
        System.out.println("** Correct!" + this.getName() + " in " + counter +" guesses.**");
    }
}
