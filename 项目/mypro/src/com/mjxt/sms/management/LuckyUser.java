package com.mjxt.sms.management;

import com.mjxt.sms.data.Data1;
import java.util.Scanner;
public class LuckyUser {
	//Data1 da=new Data1();
	Menu me=new Menu();
	String op2="m";
	Scanner in =new Scanner(System.in);
	public void luser(Data1 da){
		String op="w";
		
		me.dll3();
		//System.out.println("请选择或者按n返回上一层");
		op2=in.next();
	
		switch(op2){
		case "1":
			System.out.println("最高积分的会员是："+maxU(da));
			System.out.println("按n返回上一层：");
			while(op.equals("w")){				
				op=in.next();
				if(op.equals("n")){
					luser(da);
				}else{
					System.out.println("输入错了");
				}
			}
			break;
		case "2":
			drak(da);
			System.out.println("按n返回上一层：");
			while(op.equals("w")){				
				op=in.next();
				if(op.equals("n")){
					luser(da);
				}else{
					System.out.println("输入错了");
				}
			}
			break;
		case "3":
			System.out.println("输入今天的日期：");
			wenHou(in.next(),da);
			System.out.println("按n返回上一层：");
			while(op.equals("w")){				
				op=in.next();
				if(op.equals("n")){
					luser(da);
				}else{
					System.out.println("输入错了");
				}
			}
			break;
		case "n":
			break;
		default :
			System.out.println("输入错误，重新输入！！");
			luser(da);
			break;
		}
		//return true;
	}
	public int maxU(Data1 da){
		int max=0;
		for(int i=0;i<da.cus.length-1;i++){
			if(da.cus[i].getIntegral()<da.cus[i+1].getIntegral()){
				max=i+1;
			}
		}
		return da.cus[max].getNum();
	}
	public void drak(Data1 da){
		int num;
		num=(int)(Math.random()*10);
		if(da.cus[num].getNum()!=0){
			System.out.println("幸运客户为："+da.cus[num].getNum());
		}else{
			System.out.println("无幸运客户");
		}
	}
	public void wenHou(String date,Data1 da){
		for(int i=0;i<da.cus.length;i++){
			if(date.equals(da.cus[i].getBirthday())){
				System.out.println(da.cus[i].getNum()+"生日快乐！！");
				break;
			}else if(i==da.cus.length-1){
				System.out.println("没有过生日的会员。");
			}
		}
	}
	
	

}
