package com.mjxt.sms.management;
import java.util.Scanner;

import com.mjxt.sms.data.Data1;
import com.mjxt.sms.data.Manager;
public class Opop2 {
	Scanner in =new Scanner(System.in);
	CustomerCao cc=new CustomerCao();
	EquipmentMan ee=new EquipmentMan();
	Menu me=new Menu();
	Manager m=new Manager();
	LuckyUser lu=new LuckyUser();
	public  void op(Data1 da){
		String opa=null;//处理（1，1，n、n）问题；
		
		switch(in.nextInt()){
		case 1:
			if(cc.khm(da)){
				opa=cc.opa;
				if(opa.equals("n")){
					op(da);
				}else 
				break;
			}else
				op(da);
			break;
		case 2:	
			me.dll2();
			ee.buy(da);
          System.out.println("按n返回上一级：");
			
			if(in.next().equals("n")){
				me.dll();
				op(da);
			}
			else
			break;
		case 3:
			lu.luser(da);
			if(lu.op2.equals("n")){
				
				me.dll();
				op(da);
			} 		   
		    break;
		case 4:
			me.dl();
			m.dljm();
			me.dll();
			op(da);
			break;
		default :
			System.out.println("输入错误，重新输入！");
			op(da);
			
		}
	}

}