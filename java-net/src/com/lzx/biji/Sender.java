package com.lzx.biji;


import java.io.IOException;
import java.net.*;

/**
 * 发送端
 * Created by xianyaoji on 2017/4/27.
 */
public class Sender {
    public static void main(String[] args) throws IOException {

        //1.构建socket对象
        DatagramSocket socket = new DatagramSocket();//发送端不需要指定端
        //2. 准备发送的数据
        byte[] content = "你好，屌丝".getBytes();//准备数据
        System.out.println(content.length);
        DatagramPacket packet = new DatagramPacket(content,
                content.length,
                InetAddress.getByName("127.0.0.1"), 8888);  //数据报中指定ip和端口了

        //3.发送数据报
        //while(true){
            System.out.println("发送数据");
            socket.send(packet);
       // }
        //关闭套接字
       // socket.close();
    }
        
    }


