package com.lzx;
import java.util.*;
import java.util.Map.Entry;
public class DengluDemo {
	User1 us=new User1();
	public static void main(String[] args) {
		DengluDemo dd=new DengluDemo();
		dd.op();
	}
	public Map<String,String> getMap(){
		Map<String,String> mm=new HashMap<>();
		return mm;
	}
	public void zc(String s1,String s2){
		Map<String,String> mm=us.init();
		if(mm.size()==0){
			mm.put(s1, s2);
		}
		
		else if(panDuan(s1)){
			mm.put(s1,s2);
		}else
			{System.out.println("注册失败");}
		System.out.println(mm);
	}
	public boolean dl(String s1,String s2){
		Map<String,String> mm=us.init();
		Set<Map.Entry<String, String>> ss=mm.entrySet();
		System.out.println(mm);
		for(Map.Entry<String,String> k:ss){
			
			if((k.getKey().equals(s1) && k.getValue().equals(s2))){
				System.out.println("成了");
								
				return true;//return 退出方法；
			}
		}
		System.out.println("登录失败");	
		return false;
	}
	public boolean panDuan(String s1){
		Map<String,String> mm=us.init();
		Set<String> ss=mm.keySet();
		for(String s:ss){
			if(!(s1.equals(s))){
				return true;
			}
		}
		return false;
		
	}
	public void op(){
		getMap();
		Scanner in=new Scanner(System.in);
		boolean op=true;
		while(op){
		System.out.println("A/B");
		
		String op1;
		op1=in.next();
		if(op1.equalsIgnoreCase("a")){
			System.out.println("id:");
			String s1=in.next();
			System.out.println("psw:");
			String s2=in.next();
			zc(s1,s2);
		}else if(op1.equalsIgnoreCase("b")){
			System.out.println("id:");
			String s1=in.next();
			System.out.println("psw:");
			String s2=in.next();
			if(dl(s1,s2)){
				break;
			}
		}else 
			System.out.println("false!!");
		System.out.println("y/n");
		if(in.next().equalsIgnoreCase("n")){
			op=false;			
		}
		
	}
	in.close();
	}
}
class User1{
	private Map<String,String> mm=new HashMap<String,String>();;
	public Map<String,String> init(){
		
		return mm;
	}
}
