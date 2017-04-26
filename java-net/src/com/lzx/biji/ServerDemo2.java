package com.lzx.biji;
/*客户端发送消息到服务器；
 * */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8888);
		
		Socket s=ss.accept();
		InputStream is=s.getInputStream();
		
		int len;
		byte[] bb=new byte[1024];
		while((len=is.read(bb))!=-1){
			System.out.println(new String(bb));
			
		}
		
		
		
		
	}

}
