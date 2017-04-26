package com.lzx.lianxi;
import java.io.*;
public class Pwd {
	public static void main(String[] args) throws IOException {
		User u=new User("hzit","123");
		FileInputStream fis=new FileInputStream("d:/新建文件夹/User.txt");
		FileOutputStream fos=new FileOutputStream("d:/新建文件夹/User.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(u);
		
		
	}
	

}
