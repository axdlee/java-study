package com.yeelight.runoob;

import java.io.*;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午3:00
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("yeelight.txt"));
            bufferedWriter.write("string to be copy\n");
            bufferedWriter.close();

            InputStream inputStream = new FileInputStream("yeelight.txt");
            OutputStream outputStream = new FileOutputStream(new File("tobecopy.txt"));

            byte[] buf = new byte[1024];
            int len;
            while ((len = inputStream.read(buf)) > 0) {
                outputStream.write(buf, 0, len);
            }

            inputStream.close();
            outputStream.close();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("tobecopy.txt"));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                System.out.println(str);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
