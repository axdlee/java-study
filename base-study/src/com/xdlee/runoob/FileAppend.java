package com.xdlee.runoob;

import java.io.*;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午3:14
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.xdlee.com
 */
public class FileAppend {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("xdlee.txt"));
            bufferedWriter.write("this is the first line\n");
            bufferedWriter.close();

            BufferedWriter bufferedWriter1 = new BufferedWriter(new FileWriter("xdlee.txt", true));
            bufferedWriter1.write("This is the second line\n");
            bufferedWriter1.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("xdlee.txt"));
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
