package com.yeelight.runoob;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午2:45
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class FileWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("yeelight.txt"));
            bw.write("Hello World!");
            bw.close();
            System.out.println("文件写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
