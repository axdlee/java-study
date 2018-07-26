package com.xdlee.runoob;

import java.io.File;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午3:38
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.xdlee.com
 */
public class FileCompare {
    public static void main(String[] args) {
        File file = new File("aaa.txt");
        File file1 = new File("bbb.txt");
        if (file.compareTo(file1) == 0) {
            System.out.println("文件路径一致");
        } else {
            System.out.println("文件路径不一致");
        }
    }
}
