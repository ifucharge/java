package com.mjxt.sms.management;

import com.mjxt.sms.data.Data1;
import java.util.Scanner;

import java.util.Scanner;
public class EquipmentMan {
	int s=3;
	Scanner in=new Scanner(System.in);
	CustomerCao cc=new CustomerCao();
	Menu me=new Menu();
	
	public void buy(Data1 da){
		
		int m=0;//记录购买次数
		int ss=0;//总金额
		int s1=0;//实际缴费；
		int num;
		int[] k=new int[50];
		int[] p=new int[50];
		int[] n=new int[50];
		String op="y";
		System.out.println("请输入会员号:");
		num=in.nextInt();
			if(cc.findCus1(num,da)){
				
				while(op.equals("y")){
					System.out.println("输入商品编号：");
					k[m]=in.nextInt();
					System.out.println("输入商品数量：");
					n[m]=in.nextInt();
					p[m]=da.eq[k[m]-1].getPrice()*n[m];
					m+=1;
					System.out.println("是否继续y/n");
					op=in.next();
					
				}
				
			}else{
				System.out.println("输入错误");
				buy(da);
			}								
		System.out.println("*****************************");
		System.out.println("物品          单价            数量              金额");
		for(int j=0;j<m;j++){
			System.out.println(da.eq[k[j]].getEqname()+"     "+
		da.eq[k[j]].getPrice()+"       "+n[j]+"       "+p[j]);
			
		}
		for(int j=0;j<m;j++){
			ss=ss+p[j];
		}
		System.out.println("金额总计："+ss);
		System.out.println("实际缴费：");
		s1=in.nextInt();
		System.out.println("找钱："+(s1-ss));
			
		
	}
	
	
	}



