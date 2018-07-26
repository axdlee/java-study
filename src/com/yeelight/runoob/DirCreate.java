package com.yeelight.runoob;

import java.io.File;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-25
 * Time: 下午3:40
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class DirCreate {
    public static void main(String[] args) {
        String directories = "/tmp/aaa/bbb/ccc/ddd/eee/ggg/fff/iii";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status: " + result);
        deleteDir(new File("/tmp/aaa"));
    }

    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));
                if (!success) {
                    return false;
                }
            }
        }

        if (dir.delete()) {
            System.out.println("删除目录成功");
            return true;
        } else {
            System.out.println("删除目录失败");
            return false;
        }
    }
}
