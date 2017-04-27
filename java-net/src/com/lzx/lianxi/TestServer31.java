package com.lzx.lianxi;
import java.io.*;
import java.net.*;
public class TestServer31 {
	public static void main(String[] args) throws IOException {
		ServerSocket ss=new ServerSocket(8888);
		
		FileInputStream fis=new FileInputStream("d:/新建文件夹/beijing.png");
		FileOutputStream fos=new FileOutputStream("d:/新建文件夹/touxiang2.png");
		FileOutputStream fos1=new FileOutputStream("d:/新建文件夹/11.txt");
		FileInputStream fis1=new FileInputStream("d:/新建文件夹/11.txt");
		
		Socket s=ss.accept();
		InputStream is1=s.getInputStream();
		TestServer31.copy(fos1,is1);
		
		/*InputStreamReader isr=new InputStreamReader(is1);
		BufferedReader bis1=new BufferedReader(isr);
		BufferedReader bis=new BufferedReader(isr);*/
		
		
		BufferedReader bis1=new BufferedReader(new InputStreamReader(fis1));
		
		if("1".equals(bis1.readLine())){
			System.out.println("233514");
			
			OutputStream os=s.getOutputStream();
			TestServer31.copy(os,fis);
		}else{
			//bis1.reset();
			//InputStream is=s.getInputStream();
			TestServer31.copy(fos,fis1);
			/*System.out.println(is1.read());
			TestServer31.copy(fos,is1);
			System.out.println("rrrrrrr");*/
		}
		/*OutputStream os=s.getOutputStream();
		TestServer31.copy(os,fis);*/
		//s.shutdownOutput();
		
			
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
