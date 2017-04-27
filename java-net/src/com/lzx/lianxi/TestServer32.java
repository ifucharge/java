package com.lzx.lianxi;

import java.io.*;
import java.net.*;
public class TestServer32 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8888);
		int len;
		byte[] bb=new byte[1024];
		FileInputStream fis=new FileInputStream("d:/新建文件夹/beijing.png");
		FileOutputStream fos=new FileOutputStream("d:/新建文件夹/touxiang2.png");
		FileOutputStream fos1=new FileOutputStream("d:/新建文件夹/11.txt");
		FileInputStream fis1=new FileInputStream("d:/新建文件夹/11.txt");//这个文件用来中转；	
		
		
		Socket s=ss.accept();
		InputStream is1=s.getInputStream();
		while((len=is1.read(bb))!=-1){
			fos1.write(bb,0,len);
		}
		fos1.flush();
		BufferedReader bis1=new BufferedReader(new InputStreamReader(fis1));
		
		
		if("1".equals(bis1.readLine())){
			//判断中转文件第一行数是否是1，是1的话就下载，把服务端的文件out
			System.out.println("233514");			
			OutputStream os=s.getOutputStream();
			
			TestServer31.copy(os,fis);
			
		}else{//不是1就从中转文件读取文件到服务端，就是上传；
			TestServer31.copy(fos,fis1);		
		}
					
		}					
	public static void copy(OutputStream os,InputStream is) throws IOException{
		int len;
		byte[] bb=new byte[1024];
		while((len=is.read(bb))!=-1){
			os.write(bb,0,len);
		}
		os.flush();
		os.close();
		is.close();
	}

	
}
