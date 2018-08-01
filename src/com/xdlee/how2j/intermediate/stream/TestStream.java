package com.xdlee.how2j.intermediate.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午5:17
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class TestStream {
    public static void main(String[] args) {
        File f = new File("./stream.txt");
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(f);
            byte[] all = new byte[(int) f.length()];

            fis.read(all);
            for (byte b:all
                 ) {
                System.out.println(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
