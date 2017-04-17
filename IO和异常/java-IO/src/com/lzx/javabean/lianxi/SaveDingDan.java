package com.lzx.javabean.lianxi;

import java.io.*;
import java.util.Scanner;
public class SaveDingDan {
	public static void main(String[] args) throws IOException {
		String op="y";
		int s=0;
		ShangPing[] sp=new ShangPing[10];		
		DingDan dd=new DingDan();
		Scanner in=new Scanner(System.in);
		SaveDingDan sdd=new SaveDingDan();
		System.out.println("user:");
		dd.setName(in.next());
		while(op.equals("y")){
			
			dd.setSp(sp);
			System.out.println("no:");
			dd.getSp()[s].setNo(in.nextInt());
			System.out.println("type：");
			dd.getSp()[s].setType(in.next());
			System.out.println("price:");
			dd.getSp()[s].setPrice(in.nextDouble());
			System.out.println("ss:");
			dd.getSp()[s].setSs(in.nextInt());
			s++;
			System.out.println("y/n");
			op=in.next();
		
		OutputStream os=null;
		try {
			 os=new FileOutputStream("d:/hhhh/save.bin");
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在，请录入：");
															
			}
						
		}
		
		sdd.save(dd);
		sdd.load();
		
	}
	
	public void save(Object obj) throws IOException{
		OutputStream os=new FileOutputStream("d:/hhhh/save.bin");
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
		os.close();
	}
	public void load() throws IOException{
		InputStream is=new FileInputStream("d:/hhhh/save.bin");
		ObjectInputStream ois=new ObjectInputStream(is);
		DingDan dd=null;
		int i=0;
		double s=0;
		try {
			 dd=(DingDan)ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("产品名     单价      数量");
		while(!(dd.getSp()[i].equals(null))){
			System.out.println(dd.getSp()[i].getType()+"   "+dd.getSp()[i].getPrice()+"  "+dd.getSp()[i].getSs());
			s+=dd.getSp()[i].getPrice()*dd.getSp()[i].getSs();
			i++;
		}
		System.out.println("总价："+s);
		
	}

}
