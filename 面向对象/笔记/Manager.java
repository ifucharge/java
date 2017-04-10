package com.lzx.op.origin;

public class Manager extends Employee{
	public Manager(String name,int age,int salary){
		super(name,age,salary);
	}
	public int salm(){
		return (super.getSalary()+500);//用super.方法来调用父类的方法，
	}
	public int salm(int salary){
		return (salary+500);
	}
	public static void main(String[] args){
		//System.out.println(super.name);
	}
	public void test(){
		System.out.println("hello");
	}

	
}
