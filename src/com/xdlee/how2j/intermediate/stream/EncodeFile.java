package com.xdlee.how2j.intermediate.stream;

import java.io.*;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-27
 * Time: 上午9:36
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class EncodeFile {
    public static void main(String[] args) {

    }

    public static void encodeFile(File encodingFile, File encodedFile) {
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader(encodingFile);
            fw = new FileWriter(encodedFile);

            char[] all = new char[(int) encodingFile.length()];
            fr.read(all);

            for (int i = 0; i < all.length; i++) {
                if (all[i] > 47 && all[i] < 58) {
                    if (all[i] == 57) {
                        all[i] = 0;
                    } else {
                        all[i] += 1;
                    }
                } else if ((all[i]>64&&all[i]<91)||(all[i]>96&&all[i]<123)){
                    if (all[i]==90 && all[i]==122){
                        all[i]-=25;
                    }else {
                        all[i]+=1;
                    }
                }
                fw.write(all[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
