package com.lzx.lianxi;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient3 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s=new Socket(InetAddress.getLocalHost(),8888);
		byte[] bb=new byte[1024];
		int len=0;
		FileOutputStream fos=new FileOutputStream("d:/新建文件夹/beijing2.png");
		FileInputStream fis=new FileInputStream("d:/新建文件夹/touxiang.png");
		InputStream is=s.getInputStream();
		while((len=is.read(bb))!=-1){
			fos.write(bb,0,len);			
		}
		fos.flush();
		s.shutdownInput();
		byte[] bb1=new byte[1024];
		int len1=0;
		OutputStream os=s.getOutputStream();
		while((len1=fis.read(bb1))!=-1){
			os.write(bb1,0,len1);			
		}
		
		os.close();
		fis.close();
		
		
		
		is.close();
		fos.close();
		s.close();
	}


}
