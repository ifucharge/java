package com.mjxt.sms.data;

public class Data1 {
	
		public Customer[] cus=new Customer[10];
		public Equipment[] eq=new Equipment[50];
		{
		
			for(int i=0;i<cus.length;i++){
				cus[i]=new Customer();
			}
			
			
			for(int i=0;i<cus.length;i++){
				eq[i]=new Equipment();
			}
			cus[0]=new Customer(1001,"12/31",100);
			cus[1]=new Customer(1002,"10/19",120);
			cus[2]=new Customer(1003,"1/1",111);
			eq[0]=new Equipment("黄金战衣",100);
			eq[1]=new Equipment("死亡之弩",110);
			eq[2]=new Equipment("冰杖",200);
			eq[3]=new Equipment("隐身衣",140);
			eq[4]=new Equipment("魔血球",400);
		}
		
	
	
		
	
	
	

	

}
