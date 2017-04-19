package com.lzx.data;

public class Student implements Comparable<Student>{
	private String name;
	private boolean sex;
	private int age;
	private String className;
	private int score;
	public Student(){
		
	}
	
	public Student( String name, boolean sex, int age, String className, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.className = className;
		this.score = score;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return this.name+"		"+this.sex+"		"+this.age+"		"+this.className+"		"+this.score;	
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.score-o.score;
	}
	


	

}
