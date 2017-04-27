package com.lzx.biji;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class Sender1 {
	public static void main(String[] args) throws IOException {
		DatagramSocket ds1=new DatagramSocket(8889);
		while(true){
			Scanner in=new Scanner(System.in);
			DatagramSocket ds=new DatagramSocket();
			byte[] bb=in.next().getBytes();
			 DatagramPacket dp=new DatagramPacket(bb,bb.length,InetAddress.getLocalHost(),8888);			 
			 ds.send(dp);			 
			 byte[] bb1=new byte[1024];
				DatagramPacket dp1=new DatagramPacket(bb1,bb1.length);
				ds1.receive(dp1);
				bb1=dp1.getData();
				 System.out.println(new String(bb1,0,dp1.getLength()));
		}
		
		
	
		 
		 //DatagramSocket ds=new DatagramSocket();
		 
		 
	}

}
