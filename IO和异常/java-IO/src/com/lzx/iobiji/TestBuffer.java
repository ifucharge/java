package com.lzx.iobiji;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class TestBuffer {
	public static void main(String[] args) throws Exception {
		int len=0;
		InputStream is=new FileInputStream("d:/hhhh/test1.txt");
		InputStream is1=new FileInputStream("d:/新建文件夹/beijing.png");
		OutputStream is2=new FileOutputStream("d:/新建文件夹/beijing2.png");
		BufferedInputStream bis=new BufferedInputStream(is);
		BufferedInputStream bis2=new BufferedInputStream(is1);
		BufferedOutputStream bos=new BufferedOutputStream(is2);
		
		//System.out.println(bis.read());
		byte[] bb=new byte[1024];
		while((len=bis.read(bb))!=-1){
			System.out.println(new String(bb,0,len));			
		}
		while((len=bis2.read(bb))!=-1){
			bos.write(bb,0,len);
			
		}
		bos.flush();/* 想要把缓冲数组的内容输出到硬盘中:
			 * 1.缓冲数组满
			 * 2.调用flush()来刷新缓存
			 * 3.调用close，会清空缓存的()close方法内部也是调用了flush方法*/
		
	}

}
