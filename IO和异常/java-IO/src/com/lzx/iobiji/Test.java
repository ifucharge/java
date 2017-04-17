package com.lzx.iobiji;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.*;

public class Test {
	public static void main(String[] args) throws Exception {
		int len=0;
		char[] cc=new char[5];
		Writer ww=new FileWriter("d:/hhhh/test.txt");
		Reader rr=new FileReader("d:/hhhh/test1.txt");
		BufferedWriter bw=new BufferedWriter(ww);
		BufferedReader br=new BufferedReader(rr);
		while((len=br.read(cc))!=-1){
			bw.write(cc,0,len);
		}
		bw.flush();
		System.out.println("test");
		
		
		
	}
	
	
		
}

