package com.mjxt.sms.data;

public class Equipment {
	private String eqname;
	private int price;
	public Equipment() {
	
	}
	public Equipment(String eqname,int price){
		this.eqname=eqname;
		this.price=price;
	}
	public String getEqname() {
		return eqname;
	}
	public void setEqname(String eqname) {
		this.eqname = eqname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
