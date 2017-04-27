package com.lzx;
import java.net.*;
import java.io.*;
public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket(InetAddress.getLocalHost(),10086);
		
		OutputStream os=s.getOutputStream();
		os.write("123456".getBytes());
		s.shutdownOutput();
		InputStream is=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		System.out.println(br.readLine());
		/*OutputStream os1=s.getOutputStream();
		os.write("1234561323312".getBytes());*/
		//s.shutdownOutput();
		br.close();
	}

}
