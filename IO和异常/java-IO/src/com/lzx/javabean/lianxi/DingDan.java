package com.lzx.javabean.lianxi;

import java.io.Serializable;

public class DingDan implements Serializable{
	private String name;
	private ShangPing[] sp;
	public DingDan(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ShangPing[] getSp() {
		return sp;
	}
	public void setSp(ShangPing[] sp) {
		this.sp = sp;
	}
	

}
