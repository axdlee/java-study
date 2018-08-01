package com.xdlee.how2j.intermediate.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-27
 * Time: 上午9:31
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class CharacterStream2 {
    public static void main(String[] args) {
        File f = new File("./sream.txt");

        try (FileWriter fw = new FileWriter(f)) {
            String data = "fafeasgasrgrgaa";
            char[] cs = data.toCharArray();
            fw.write(cs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
