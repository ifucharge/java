package com.lzx.lianxi;
/*实现文件的上传和下载
 * */
import java.net.*;
import java.io.*;

public class TestServer3 {
	public static void main(String[] args) throws IOException {
	ServerSocket ss=new ServerSocket(8888);
	int len;
	byte[] bb=new byte[1024];
	FileInputStream fis=new FileInputStream("d:/新建文件夹/beijing.png");
	FileOutputStream fos=new FileOutputStream("d:/新建文件夹/touxiang2.png");
	Socket s=ss.accept();
	OutputStream os=s.getOutputStream();	
	while((len=fis.read(bb))!=-1){
		os.write(bb,0,len);		
	}
	
	os.flush();
	s.shutdownOutput();
	int len1=0;
	byte[] bb1=new byte[1024];
	InputStream is=s.getInputStream();
	while((len1=is.read(bb1))!=-1){
		fos.write(bb1,0,len1);
	}
	fos.flush();
	is.close();
	fos.close();
	
	
	os.close();
	fis.close();
	s.close();
	
	}

}
