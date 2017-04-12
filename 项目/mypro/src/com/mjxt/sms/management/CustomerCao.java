package com.mjxt.sms.management;

import com.mjxt.sms.data.Data1;
import com.mjxt.sms.data.Manager;

import java.util.Scanner;
public class CustomerCao {
	int s=3;//处理空指针异常；
	//Data1 da=new Data1();
	//Opopop oo=new Opopop();
	Scanner in=new Scanner(System.in);
	Menu me=new Menu();
	Manager ma=new Manager();
	String opa;//把变量定义到这里是为了让	Opop2的op方法调用，解决进入到查看会员信息界面后返回到op界面就结束的问题；
	public boolean khm(Data1 da){
		
		me.dlll();
		
		//System.out.println("按“n”或请选择：");
		opa=in.next();
		if(opa.equals("n")){
			me.dll();
			return false;
			//oo.op();
		}else
		switch(opa){
		case "1":
			System.out.println("会员号      生日      积分");
			for(int j=0;j<s;j++){
				System.out.println(da.cus[j].toString());
			}
			
			System.out.println("按n返回上一级菜单：");
			while(in.next().equals("n")==false){
				System.out.println("输入错误，重来n");
				
			}
			khm(da);
			
			
			break;
		case "2":	
			String op="y";
			while(op.equals("y")){
			System.out.println("会员号：");
			int s1=in.nextInt();
			System.out.println("生日：");
			String s2=in.next();
			System.out.println("积分：");
			int s3=in.nextInt();
			if(addCus(s1,s2,s3,da)){
				s++;
				System.out.println("添加成功");
				System.out.println("是否继续y/n");
				op=in.next();
			}else {
				System.out.println("失败");
				System.out.println("是否继续y/n");
				op=in.next();
			}
							
			}
			System.out.println("按n返回上一级菜单：");
			while(in.next().equals("n")==false){
				System.out.println("输入错误，重来n");
				
			}
			khm(da);
			break;
		case "3":
			int s4;
			System.out.println("请输入会员号：");
			while(true){
			
			 s4=in.nextInt();
			if(findCus(s4,da)){
				break;
			}else{
				System.out.println("没有该会员，再次输入");
			}
			}
			
			String op1="y";
			while(op1.equals("y")){
			me.dll1();
			System.out.println("请选择：");
			if(in.nextInt()==1){
				System.out.println("修改后的生日：");
				alterCusb(s4,in.next(),da);
				System.out.println("生日信息已修改");
				System.out.println("是否继续y/n");
				op1=in.next();
			}
			else {
				System.out.println("修改后的积分：");
				alterCusi(s4,in.nextInt(),da);
				System.out.println("积分信息已修改");
				System.out.println("是否继续y/n");
				op1=in.next();
			}
			}
			System.out.println("按n返回上一级菜单：");
			while(in.next().equals("n")==false){
				System.out.println("输入错误，重来n");
				
			}
			khm(da);
			break;
		case "4":
			String op2="y";
			while(op2.equals("y")){
			System.out.println("输入会员号：");
			if(findCus(in.nextInt(),da)){
				System.out.println("查找成功 y/n");
				op2=in.next();
			}else{
				System.out.println("查找失败y/n");
				op2=in.next();
			}
		}
			System.out.println("按n返回上一级菜单：");
			while(in.next().equals("n")==false){
				System.out.println("输入错误，重来n");
				
			}
			khm(da);
			break;
		default :
			System.out.println("按“n”或请选择：");
			khm(da);
			break;
		}
		return true;
		
			
		
	}
	public boolean addCus(int num,String birthday,int integral,Data1 da){
		if(num%1000>=1 && num%1000<=9){
			for(int j=0;j<da.cus.length;j++){
			if( da.cus[j].getNum()==0){
				da.cus[j].setNum(num);
				da.cus[j].setBirthday(birthday);
				da.cus[j].setIntegral(integral);
				break;
								
			}//else return false;			
		}return true;
			
		}else
		
		return false;
					
	}
	public boolean alterCusb(int num,String birthday,Data1 da){
		for(int i=0;i<da.cus.length;i++){
			if(da.cus[i].getNum()==num){
				da.cus[i].setBirthday(birthday);
				return true;
			}
		}
		return false;
	}
	public boolean alterCusi(int num,int integral,Data1 da){
		for(int i=0;i<s;i++){
			if(da.cus[i].getNum()==num){
				da.cus[i].setIntegral(integral);
				return true;
			}
		}
		return false;
	}
	public boolean findCus(int num,Data1 da){
		for(int j=0;j<s;j++){
			if(da.cus[j].getNum()==num){
				System.out.println(da.cus[j].toString());	
				return true;
			}
		}
		return false;
	}
	public boolean findCus1(int num,Data1 da){//这个方法给EquipmentMan用的；
		for(int j=0;j<s;j++){
			if(da.cus[j].getNum()==num){
					
				return true;
			}
		}
		return false;
	}
	
	

}
