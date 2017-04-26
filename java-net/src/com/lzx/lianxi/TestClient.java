package com.lzx.lianxi;



import java.io.IOException;
import java.io.*;
import java.io.OutputStream;
import java.net.*;
import java.util.Scanner;

public class TestClient {
	public static void main(String[] args) throws UnknownHostException, IOException, InterruptedException {
		int len;
		byte[] bb=new byte[1024];
		Scanner in=new Scanner(System.in);
		System.out.println("输入用户名：");
		String s1=in.next();
		System.out.println("输入密码：");
		String s2=in.next();
	
		Socket s=new Socket("192.168.1.154",10086);
		OutputStream os=s.getOutputStream();
		
		os.write((s1+s2).getBytes());
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
