package com.yeelight.headfirst;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by Sheldon
 * User: sheldon
 * Date: 18-7-24
 * Time: 下午5:57
 *
 * @author Sheldon Lee <xdlee110@gmail.com>
 * @link https://www.yeelight.com
 */
public class GreetingClient {
    public static void main(String[] args) {
        String serverName = "localhost";
        int port = Integer.parseInt("6066");

        try {
            System.out.println("连接到主机：" + serverName + ",端口：" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务器响应：" + in.readUTF());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
