package com.lzx.mabye;
//this的运用；
public class Hello{
	 int a;
	int b;
	public Hello(){
		
	}
	public Hello(int a,int b){
		this.a=a;
		this.b=b;
	}
		public static void main(String[] args){
			//this.m();???
			Hello h=new Hello();
			h.m();
			System.out.println();
		 
		}

		public void m(){
			this.n();
			System.out.println("trer");
		}
		public void n(){
			System.out.println("123");
		}
}
