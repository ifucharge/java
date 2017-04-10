package com.lzx.op.origin;

public class Employee {
	private String name;
	private int age;
	private int salary;
	public Employee(){
		
	}
	public Employee(String name,int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	public void setName(String name){
		this.name=name;
		
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return this.age;
	}
	public void setSalary(int salary){
		this.salary=salary;
	}
	public int getSalary(){
		return this.salary;
	}
	public String toString(){
		return "Name:"+this.name+" Age:"+this.age+" Salary:"+salm();
	}
	public int salm(){
		return salary;
	}
		
}

