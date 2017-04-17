package com.lzx.iobiji;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO2 {
	public static void main(String[] args) throws IOException {
		int len=0;
		File file2=new File("d:/hhhh/test1.txt");
		File file3=new File("d:/hhhh/test2.txt");
		File file4=new File("d:/新建文件夹/beijing.png");
		File file5=new File("d:/新建文件夹/beijing1.png");
		FileOutputStream fos=new FileOutputStream(file3);
		FileInputStream fis=new FileInputStream(file2);
		FileOutputStream fos1=new FileOutputStream(file5);
		FileInputStream fis1=new FileInputStream(file4);
		byte[] bb1=new byte[1024*8*1024];
		byte[] bb=new byte[1024];
		/*while((fis.read())!=-1){
			fos.write(fis.read());
		}*///会造成复制的数据缺失；????调用了两次fis.read方法，所以要加一个len
		/*while((len=fis.read())!=-1){
			fos.write(len);
		}*/
		while((len=fis1.read(bb1))!=-1){
			fos1.write(bb1,0,len);//为了保证复制出来的文件大小相等;
		}
		
	}	

}
