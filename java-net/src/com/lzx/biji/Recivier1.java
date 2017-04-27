package com.lzx.biji;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class Recivier1 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds=new DatagramSocket(8888);
		while(true){
			
			byte[] bb=new byte[1024];
			DatagramPacket dp=new DatagramPacket(bb,bb.length);
			ds.receive(dp);//会阻塞
			bb=dp.getData();
			 System.out.println(new String(bb,0,dp.getLength()));
			 
			 			 
				Scanner in=new Scanner(System.in);
				DatagramSocket ds1=new DatagramSocket();
				byte[] bb1=in.next().getBytes();
				 DatagramPacket dp1=new DatagramPacket(bb1,bb1.length,InetAddress.getLocalHost(),8889);
				 ds.send(dp1);
			 
		}
		
		
		
	}

}
