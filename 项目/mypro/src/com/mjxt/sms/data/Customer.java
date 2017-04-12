package com.mjxt.sms.data;

public class Customer {
	private int num;
	private String birthday;
	private int integral;
	public Customer(){
		
	}
	public Customer(int num,String birthday,int integral){
		this.num=num;
		this.birthday=birthday;
		this.integral=integral;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getIntegral() {
		return integral;
	}
	public void setIntegral(int integral) {
		this.integral = integral;
	}
	public String toString(){
		return this.num+"    "+this.birthday+"    "+this.integral;
	}
	

}
