package com.lzx.lianxi;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClient2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		User user=new User("123","123");
		Socket s=new Socket("192.168.1.154",8888);
		ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
		oos.writeObject(user);
		
		InputStream is=s.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(br.readLine());
		
		oos.close();
		br.close();
	}

}
