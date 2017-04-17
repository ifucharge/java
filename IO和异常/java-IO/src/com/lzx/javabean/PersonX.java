package com.lzx.javabean;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*序列化操作
 * */
public class PersonX {
	public static void main(String[] args) throws IOException {
		Person per=new Person();
		per.setAge(22);
		per.setName("张三");
		per.setSchool("wqlke sc");
		OutputStream os=new FileOutputStream("d:/hhhh/序列化.txt");
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(per);
		oos.flush();
		os.close();
		oos.close();
	}

}
