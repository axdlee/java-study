package com.xdlee.runoob;

import java.io.File;
import java.io.IOException;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午3:20
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.xdlee.com
 */
public class FileTemp {
    public static void main(String[] args) {
        File file = null;

        try {
            // 创建临时文件
            file = File.createTempFile("temp", ".txt", new File("./"));

            // 输出绝对路径
            System.out.println("File path: " + file.getAbsolutePath());

            // 终止后删除临时文件
            file.deleteOnExit();

            // 创建临时文件
            file = File.createTempFile("temp", null, new File("./"));

            // 输出绝路径
            System.out.println("File Path: " + file.getAbsolutePath());

            // 终止后删除临时文件
            file.deleteOnExit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
