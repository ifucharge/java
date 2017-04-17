package com.lzx.iobiji;
/*IO字符流；
 * */
import java.io.*;

public class TestIOrw {
	public static void main(String[] args) throws Exception {
		File file =new File("d:/hhhh/test1.txt");
		FileReader fr=new FileReader(file);
	     //FileWriter fw=new FileWriter(file);
		//读写不要这样使用同一个文件，会清空原文件内容；
		FileWriter fw=new FileWriter("d:/hhhh/test.txt");
		FileWriter fw1=new FileWriter("d:/hhhh/test2.txt");
		int len=0;
		
		/*char[] cc={'a','b','v'};
		//fw1.write('a');//字符流输出后要flush才会显示,字节流就不用;
		  fw1.write("sadsad");//直接输入字符串；
		fw.write(cc);
		fw.flush();		
		System.out.println(fr.read());//边写边读就要flush		
*/		
		char[] cc=new char[5];
		while((len=fr.read(cc))!=-1){
			System.out.println(new String(cc,0,len));
	}//读取文件字符；
		
		
	/*	char[] cc1=new char[10];
		while((len=fr.read(cc1))!=-1){
			fw1.write(cc1,0,len);
		}
		fw1.flush();//copy
	fw1.close();*/
	}

}
