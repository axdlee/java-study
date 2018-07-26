package com.yeelight.runoob;

import java.io.File;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午3:30
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class FileSize {
    public static void main(String[] args) {
        long size = getFileSize("yeelight.txt");
        System.out.println("文件大小为：" + size);
    }

    public static long getFileSize(String filename) {
        File file = new File(filename);

        if (!file.exists() || !file.isFile()) {
            System.out.println("文件不存在");
            return -1;
        }

        return file.length();
    }
}
