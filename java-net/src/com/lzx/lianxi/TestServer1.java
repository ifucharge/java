package com.lzx.lianxi;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class TestServer1 implements Runnable{	
	Socket s;
	public TestServer1(){
		
	}
	public TestServer1(Socket s){
		this.s=s;
	}
	public void run() {
		String str=null;
		InputStream is;
		try {
			is = s.getInputStream();
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
			if(str.equals("123123")){
				os.write("ok".getBytes());
			}else{
				os.write("error".getBytes());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}	
	
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(10086);
				while(true){
					Socket s=ss.accept();
					Thread th1=new Thread(new TestServer1(s));
					th1.start();
					
				}
	
						
		
												
	}
}

