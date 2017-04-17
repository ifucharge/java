package com.lzx.iobiji;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class TestBuffer2 {
	public static void main(String[] args) throws IOException {
		File file=null;
		String st=null;
		int len=0;
		file=new File("d:/hhhh/test1.txt");
		Writer os=new FileWriter(file);
		//Reader re=new FileReader(file);
		Reader re2=new FileReader("d:/hhhh/test2.txt");
		BufferedWriter bw=new BufferedWriter(os);
		BufferedReader br=new BufferedReader(re2);
		bw.write("saSA");
		bw.flush();
		while((st=br.readLine())!=null){
		System.out.println(st);
		}//对于输入多行字符串；	
	
		
		
	}


}
