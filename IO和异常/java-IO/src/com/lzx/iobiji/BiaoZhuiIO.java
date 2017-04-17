package com.lzx.iobiji;

import java.io.*;
/*标准的IO写法；
 * */
public class BiaoZhuiIO {
	public static void main(String[] args) {
		File file1=null;
		File file2=null;
		file1=new File("d:/hhhh/test1.txt");
		file2=new File("d:/hhhh/test2.txt");
		BiaoZhuiIO bz=new BiaoZhuiIO();
		bz.copyFile(file1.getAbsolutePath(),file2.getAbsolutePath());
		
	}
	public void copyFile(String path1,String path2){
		int len=0;
		byte[] bb=new byte[1024];
		FileInputStream fis=null;
		FileOutputStream fos=null;//定义在外面是为了让finally可以使用该对象；
		try {
			
			 fis=new FileInputStream(path1);
			 fos=new FileOutputStream(path2);
			while((len=fis.read(bb))!=-1){
				fos.write(bb,0,len);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("未找到文件");
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("io异常");
		}
		
		finally{
			if(fos!=null){
				try {
					fos.close();//后使用先关闭；
				} catch (IOException e) {
					System.out.println("出错了");
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					System.out.println("出错了");
					e.printStackTrace();
				}
			}
		}

	}

}
