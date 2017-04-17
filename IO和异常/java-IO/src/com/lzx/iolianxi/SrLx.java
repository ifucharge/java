package com.lzx.iolianxi;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class SrLx {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		SrLx sl=new SrLx();
		System.out.println("输入标题：");
		sl.sr(in.next());
		System.out.println("输入作者：");
		sl.sr(in.next());
		System.out.println("内容：");
		sl.sr(in.next());
		in.close();
	}
	public void sr(String s){
		FileWriter fw=null;
		try {
			 fw=new FileWriter("d:/hhhh/xinwen.txt",true);
			 fw.write(s);
		} catch (FileNotFoundException e) {
			System.out.println("文件未找到");
			e.printStackTrace();
		} catch(IOException e){
			System.out.println("出错了");
		}finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		

	}

}
