package com.lzx;

import java.io.*;

public class XvLeiStudent {
	public static void main(String[] args) {
		Student stu=new Student("张三",11);
		Student stu1=null;
		XvLeiStudent xs=new XvLeiStudent();
		xs.save(stu, "d:/新建文件夹/11.txt");
		try {
			stu1=(Student)xs.road("d:/新建文件夹/11.txt");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(stu.toString());
		
	}
	public void save(Object obj,String path){
		File file=new File(path);
		OutputStream os=null;
		ObjectOutputStream oos=null;
		try {
			 os=new FileOutputStream(file);
			 oos=new ObjectOutputStream(os);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oos.writeObject(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public Object road(String path) throws ClassNotFoundException, IOException{
		File file =new File(path);
		InputStream is=null;
		ObjectInputStream ois=null;
		try {
			is=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			ois=new ObjectInputStream(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ois.readObject();
		
		
		
	}

}
