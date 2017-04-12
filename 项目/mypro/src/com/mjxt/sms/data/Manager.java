package com.mjxt.sms.data;
import java.util.Scanner;

import com.mjxt.sms.management.Menu;
public class Manager {
	//Data da=new Data();
	Menu me=new Menu();
	Scanner in=new Scanner(System.in);
	private String name="manager";
	private String password="0000";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean pass(String name,String password){
		if(this.name.equals(name) && this.password.equals(password)){
			return true;
		}
		return false;
	}
	public boolean alter(String name,String password,String password2){
		this.name=name;
		this.password=password;
		if(password.equals(password2)){
			System.out.println("用户名和密码已更改");			
			return true;
		}else{
			System.out.println("两次密码不一致");
			return false;
		}	
	}
    public void dljm(){
    	//System.out.println("请选择：");
    	//boolean op=false;
    	//while(op=false){
		switch(in.nextInt()){
		case 1:
			for(int i=0;i<3;i++){
			System.out.println("用户名：");
			String ma1=in.next();
			System.err.println("密码");
			String ma2=in.next();
			if(pass(ma1,ma2)){
				//op=true;
				break;//待解决终止程序问题？？
			}
			else if(i==2){
				System.out.println("三次输入错误，退出系统");
				System.exit(1);
			}
			System.out.println("用户名和密码不匹配，重新输入");
			}
			
			break;
		case 2:
			System.out.println("用户名：");
			String k1=in.next();
			System.err.println("密码");
			String k2=in.next();
			if(pass(k1,k2)){
				System.out.println("请输入新用户名：");
				String s=in.next();
				System.err.println("新密码");
				String s1=in.next();
				System.err.println("再次输入新密码");
				String s2=in.next();
				alter(s,s1,s2);
				me.dl();
				dljm();
				break;				
			}else System.out.println("输入错误登出");
				System.exit(1); 
		case 3:
			 System.exit(1); 
			
	    default:
	    	System.out.println("输入错误，重新输入！！");
	    	dljm();
			
		}
		
    }

    }	
	//}


