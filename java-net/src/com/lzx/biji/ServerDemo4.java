package com.lzx.biji;

import java.net.*;
import java.io.*;

public class ServerDemo4 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss= ss=new ServerSocket(8888);
		FileInputStream fis=null;
		Socket s=null;
		int len;
		byte[] bb=new byte[1024];
		
		while(true){
			try {
				
				 fis=new FileInputStream("d:/新建文件夹/beijing.png");
				 
				 s=ss.accept();
				 OutputStream os=s.getOutputStream();
				 System.out.println("有用户连接");
				 while((len=fis.read(bb))!=-1){
					 os.write(bb,0,len);	
					 
				 }
				 os.flush();
				 os.close();
				 s.close();
				 
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				if(fis!=null){
					try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		
		
	}
	

}
