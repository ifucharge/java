package com.lzx.lianxi;

import java.io.*;
import java.net.*;

public class TestServer2 {
	public static void main(String[] args) {
		ServerSocket ss=null;
		Server2 ser=null;
		boolean b=true;
		try {
			ss = new ServerSocket(8888);
			
			
			while(b){
				ser=new Server2(ss.accept());
				Thread th1=new Thread(ser);
				System.out.println("有客户连接");
				th1.start();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
									
	}

}
class Server2 implements Runnable{
	Socket s;
	public Server2()
	{
		
	}
	public Server2(Socket s){
		this.s=s;
	}

	public void run() {
		ObjectInputStream ois=null;
		User user=null;
		OutputStream os=null;
		try {			
			ois=new ObjectInputStream(s.getInputStream());		
			 user=(User)ois.readObject();
			 System.out.println(user.toString());
			  os=s.getOutputStream();
				if("123".equals(user.getUser()) && "123".equals(user.getPwd())){
					os.write("ok".getBytes());
				}else{
					os.write("error".getBytes());
				}
			 os.flush();
			 ois.close();
			 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
