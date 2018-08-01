package com.xdlee.how2j.intermediate.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-26
 * Time: 下午5:28
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class CharacterStream {
    public static void main(String[] args) {
        File f = new File("./stream.txt");
        try (FileReader fr = new FileReader(f)){
            char[] all = new char[(int) f.length()];
            fr.read(all);
            for (char c : all) {
                System.out.println(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
