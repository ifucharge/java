package com.lzx.collectionlianxi;

import java.util.*;

public class TestP {
	public static void main(String[] args) {
		Mysort1 m1=new Mysort1();
		Set<Person1> ss=new TreeSet<>(m1);
		ss.add(new Person1(2,"aa",22,2000,"2234565"));
		ss.add(new Person1(1,"ca",23,4000,"1234565"));
		ss.add(new Person1(3,"da",22,3000,"5234565"));
		System.out.print(ss);
	}

}
class Person1  implements Comparable<Person1>{
	private int id;// 编号
	private String name;// 姓名
	private int age;// 年龄
	private double salary;// 薪水
	private String mobile;// 手机号码

	public Person1() {
		
	}

	public Person1(int id, String name, int age, double salary, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", mobile=" + mobile
				+ "]";
	}

	@Override
	public int compareTo(Person1 o) {
		// TODO Auto-generated method stub
		
		return o.getAge()-this.age;
	}
	

}

class Mysort1 implements Comparator<Person1>{

	@Override
	public int compare(Person1 o1, Person1 o2) {
		
		//return o1.getId()-o2.getId();//id升序
		//return o1.getMobile().compareTo(o2.getMobile());//手机号升序；
		return (int)(o2.getSalary()-o1.getSalary());//薪水将序
	}
	
}
