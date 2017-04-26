package com.lzx.biji;

import java.io.IOException;
import java.io.*;
import java.io.OutputStream;
import java.net.*;

import com.lzx.lianxi.User;

public class ClientDemo3 {
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		int len;
		byte[] bb=new byte[1024];
	
		Socket s=new Socket("192.168.1.154",10086);
		OutputStream os=s.getOutputStream();
		
		os.write("123".getBytes());
		s.shutdownOutput();
		InputStream is=s.getInputStream();
		if(is!=null){
			while((len=is.read(bb))!=-1){
				System.out.println(new String(bb,0,len));
			}
		}		
		os.close();
		s.close();
		
	}
	

}
