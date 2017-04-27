package com.lzx.biji;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 接受端
 * Created by xianyaoji on 2017/4/27.
 */
public class Recivier {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(8888);
        //在8888端口处等待发送者发送数据
        byte[] content = new byte[64*1024];   //64K
        //  new DatagramPacket(content,content.length);--->接受数据
       // while(true){
            DatagramPacket packet = new DatagramPacket(content,content.length);
            socket.receive(packet);   //接受一个数据报,数据就存在数据报中
            content = packet.getData();//获取数据
            System.out.println(new String(content,0,packet.getLength())); //打印数据
        System.out.println(packet.getLength()); //获取接受的数据长度
       // }
        //socket.close();
        
        
        
        
        DatagramSocket socket1 = new DatagramSocket();//发送端不需要指定端
        //2. 准备发送的数据
        byte[] content1 = "你好，屌丝".getBytes();//准备数据
        System.out.println(content1.length);
        DatagramPacket packet1 = new DatagramPacket(content1,
                content1.length,
                InetAddress.getByName("127.0.0.1"), 8889);  //数据报中指定ip和端口了

        //3.发送数据报
        //while(true){
            System.out.println("发送数据");
            socket.send(packet1);
        //}
    }
}
