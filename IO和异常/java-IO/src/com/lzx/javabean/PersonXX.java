package com.lzx.javabean;

import java.io.*;

/*反序列化：
 * */
public class PersonXX {
	public static void main(String[] args) throws IOException{
		InputStream is=new FileInputStream("d:/hhhh/序列化.txt");
		ObjectInputStream ois=new ObjectInputStream(is);
		Person per=null;
		try {
			 per=(Person)ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(per.toString());
	}
	

}
