package com.lzx.biji;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClientDome1 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		 Socket s=new Socket("192.168.1.154",8888);
		 java.io.InputStream is=s.getInputStream();
		 int len=0;
		 byte[] bb=new byte[1024];
		 while((len=is.read(bb))!=-1){
			 System.out.println(new String(bb));
		 }		 
		/* OutputStream os=s.getOutputStream();
		 os.write("反馈到服务器！！".getBytes());
		 s.close();*/
	}

}
