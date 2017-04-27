package com.lzx.lianxi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("d:/新建文件夹/touxiang2.png");
		FileInputStream fis1=new FileInputStream("d:/新建文件夹/11.txt");
		TestServer31.copy(fos,fis1);
	}

}
