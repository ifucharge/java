package com.lzx.biji;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerDemo3 implements Runnable{	
	
	public void run() {
		
		
	}	
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10086);
		String str=null;		
		while(true){
			Socket s=ss.accept();			
			InputStream is=s.getInputStream();
			if(is!=null){
				int len;
				byte[] bb=new byte[1024];
				while((len=is.read(bb))!=-1){
					 str=new String(bb,0,len);
					System.out.println(str);
				}
			}
			s.shutdownInput();
			OutputStream os=s.getOutputStream();
			if(str.equals("123")){
				os.write("ok".getBytes());
			}
		}										
	}
}

