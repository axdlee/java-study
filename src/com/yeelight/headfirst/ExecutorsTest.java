package com.yeelight.headfirst;

import java.util.concurrent.ExecutorService;

import static java.util.concurrent.Executors.*;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 上午10:28
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        ExecutorService service = newFixedThreadPool(5);
        TaskRunnable task = new TaskRunnable();

        service.submit(task);
        System.out.println("---------------------------------");
        service.submit(task);
        service.shutdown();
    }
}
