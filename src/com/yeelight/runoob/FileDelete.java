package com.yeelight.runoob;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午2:56
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
import java.io.*;

public class FileDelete {
    public static void main(String[] args) {
        File file = new File("yeelight.txt");
        if (file.delete()) {
            System.out.println("文件删除成功");
        } else {
            System.out.println("文件删除失败");
        }
    }
}
