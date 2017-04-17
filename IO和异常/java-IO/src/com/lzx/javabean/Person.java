package com.lzx.javabean;

import java.io.Serializable;

/*这是一个javabean，要求如下；
 * 1.共有的无参数构造器
 * 2.私有的属性；
 * 3.get，set方法；
 * Serializable：实现Serializable接口的javabean就能序列化了；
 * */
public class Person implements Serializable{
	private String name;
	private int age;
	private String school;
	public void Person(){
		
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
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String toString(){
		return "name:"+this.name+"age:"+this.age+"school:"+this.school;
	}
	

}
