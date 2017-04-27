package com.lzx;
import java.net.*;
import java.io.*;
public class Server{
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10086);
		
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());
		
		//s.shutdownInput();
		
		OutputStream os=s.getOutputStream();
		os.write("asd".getBytes());
		
	/*	InputStream is1=s.getInputStream();
		BufferedReader br1=new BufferedReader(new InputStreamReader(is1));
		System.out.println(br1.readLine());
		br1.close();*/
		s.shutdownOutput();
		
		
		s.shutdownInput();
		br.close();
		
	}
}