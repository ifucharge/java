package com.mjxt.sms.data;
import java.util.Scanner;

import com.mjxt.sms.management.Menu;
public class Manager1 {
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
    public boolean dljm(int k){
    	boolean op=false;
    	if(k==1){
    		while(op==false){
    			System.out.println("用户名：");
    			String ma1=in.next();
    			System.err.println("密码");
    			String ma2=in.next();
    			if(pass(ma1,ma2)){
    				op=true;
    				return true;
    			}else{
    				op=false;
    				return false;
    			}
    			}
    	}else if(k==2){
    		System.out.println("亲用户名：");
			setName(in.next());
			System.err.println("密码");
			setPassword(in.next());
			if(pass(getName(),getPassword())){
				System.out.println("用户名：");
				String s=in.next();
				System.err.println("密码");
				String s1=in.next();
				System.err.println("密码2");
				String s2=in.next();
				return alter(s,s1,s2);
    	}else return false;
    	
    }else if(k==3){
    	return false;
    }
    	
		return false;
    }
		
	}


