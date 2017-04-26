package com.lzx.biji;

import java.io.IOException;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s=new Socket("192.168.1.154",8888);
		OutputStream os=s.getOutputStream();
		os.write("反馈！！1".getBytes());
		
	}

}
