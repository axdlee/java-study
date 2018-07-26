package com.yeelight.runoob;

import java.io.*;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午3:14
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class FileAppend {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("yeelight.txt"));
            bufferedWriter.write("this is the first line\n");
            bufferedWriter.close();

            BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("yeelight.txt", true));
            bufferedWriter1.write("This is the second line\n");
            bufferedWriter1.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("yeelight.txt"));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str + "\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
