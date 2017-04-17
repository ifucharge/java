package com.lzx.iobiji;

import java.io.*;
public class TestIO {
	public static void main(String[] args) throws Exception{
		int count=0;
		int d=0;
		File file =new File("D:/新建文件夹/新建文本文档.txt");
		File file1=new File("d:/新建文件夹/test3.txt");
	
		FileInputStream fis=new FileInputStream(file);
		FileInputStream fis1=new FileInputStream(file1);
		FileOutputStream fos=new FileOutputStream(file,false);
		
		
		//false：数据写入文件开头处覆盖原有数据，默认为false；true：写入结尾处：
		fos.write("".getBytes());//在一个文件夹中写入数据；
		fos.write(97);//字节流要将数据转换为字节类型才能将数据写入和读取
		fos.write("nnnnnn".getBytes());
		fos.write("\r\n".getBytes());
		fos.write("cccccc".getBytes());
		/*for(int i=0;i<file.length();i++){
			System.out.println((char)fis.read());
			System.out.print(" "+fis.read());
			*/
		
		byte[] bb=new byte[1024];
		while((d=fis1.read(bb))!=-1){
			//1.当还有很多内容没有读取时，read(byte[] b) 返回的数据就是数组的长度
			//2.当最后取时，返现没有满，此时read(byte[] b)  返回的是就是实际读取数据的长度!
			//3.当读到最后时，发现没有内容可以读取了，此时返回-1，表示读取完毕了!!
			//System.out.println(fis1.read());
			//System.out.println(d);
			System.out.println(new String(bb,0,d));
			//把数据转换成String类型
			
			
			
		}
		
		

		}
		

}