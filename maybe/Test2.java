package com.lzx.mabye;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		int len=0;
		int s=0;
		FileInputStream fis=new FileInputStream("d:/hhhh/test1.txt");
		FileOutputStream fos=new FileOutputStream("d:/hhhh/test2.txt");
		
		byte[] bb=new byte[10];
		fis.read(bb);//
		fos.write(bb);
		fis.read(bb);
		fos.write(bb);
		//test1.txt的内容为aaaaaaaaaaa(12个a)当最后读取的字符多出两个时，有问题？？
		//while((fis.read(bb))!=-1){
			//System.out.println(len);
			//System.out.println(fis.read(bb));
			//System.out.println(new String(bb));
			//System.out.println(bb[0]);
		//}
/*	while((len=fis.read(bb))!=-1){
		s++;
			fos.write(bb);
			//System.out.println(fis.read(bb));
			
	
			
			}*/
	System.out.println(s);
		}
	
		
	}



