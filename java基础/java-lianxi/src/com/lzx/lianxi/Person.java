package com.lzx.lianxi;

public class Person {
	private String name;
	private int age;
	private String sex;
	private String ID;
	public Person(){
		
	}
	
	public Person(String name, int age, String sex, String iD) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		ID = iD;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	@Override
	public String toString() {
		return "name:"+this.name+" age:"+this.age+" sex:"+this.sex+" ID:"+this.ID;
				
	}
	
	

}
