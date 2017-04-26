package com.lzx.lianxi;

import java.io.Serializable;

public class User implements Serializable{
	private String user;
	private String pwd;
	public User(){
		
	}
	public User(String user, String pwd) {
		super();
		this.user = user;
		this.pwd = pwd;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
