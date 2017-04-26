package com.lzx.biji;
/*服务端 发送消息
 * */
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SeverDome1 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8888); 
		while(true){
			Socket s=ss.accept();
			OutputStream os=s.getOutputStream();
			InputStream is=s.getInputStream();
			
			os.write("ere".getBytes());
			os.flush();
			System.out.println("有客户连接");
		
			os.close();
			s.close();
		}
	
		
	}

}
