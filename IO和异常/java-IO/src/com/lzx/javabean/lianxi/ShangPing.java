package com.lzx.javabean.lianxi;

public class ShangPing {
	public int no;
	public String type;
	public double price;
	public int ss;
	public ShangPing(){
		
	}
	public ShangPing(int no,String type,double price,int ss){
		this.no=no;
		this.type=type;
		this.price=price;
		this.ss=ss;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSs() {
		return ss;
	}
	public void setSs(int ss) {
		this.ss = ss;
	}
	

}
