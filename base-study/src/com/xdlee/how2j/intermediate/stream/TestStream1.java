package com.xdlee.how2j.intermediate.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午5:24
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class TestStream1 {
    public static void main(String[] args) {
        File f = new File("./stream.txt");

        //把流定义在try()里,try,catch或者finally结束的时候，会自动关闭
        try (FileInputStream fileInputStream = new FileInputStream(f)){
            byte[] all = new byte[(int) f.length()];
            fileInputStream.read(all);
            for (byte b : all) {
                System.out.println(b);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
