package com.lzx.lianxi;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class TestClient31 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket(InetAddress.getLocalHost(),8888);
		Scanner in=new Scanner(System.in);
		String str;
		System.out.println("1:下载 2:上传");
		str=in.next();
		
		FileOutputStream fos=new FileOutputStream("d:/新建文件夹/beijing2.png");
		FileInputStream fis=new FileInputStream("d:/新建文件夹/touxiang.png");
		//=null;
		OutputStream os=null;
		//OutputStreamWriter osw=null;
		if("1".equals(str)){//如果是1的话我就传1到服务端，不是1就传文件；
		os=s.getOutputStream();
		
		os.write(str.getBytes());	
		System.out.println("123123");
		s.shutdownOutput();	
		InputStream  is=s.getInputStream();
			 
			TestServer31.copy(fos,is);
			System.out.println("下载完成");
			//s.shutdownInput();
		}else{
			
				os=s.getOutputStream();			
				TestServer31.copy(os,fis);
				
				System.out.println("上传完成");									
		}
		
														
	
	

		
	}

}
