package com.lzx.collectionlianxi;

import java.util.*;
/*使用集合实现注册功能
 * */
public class DengR {
	Set<User> ss=new HashSet<>();
	Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		DengR dr=new DengR();
		boolean bb=true;
		
		while(bb){
			System.out.println("请选择A/B");
			dr.op(in.next());
			System.out.println("go?");
			if(in.next().equals("n")){
				bb=false;
			}
		}
		//dr.zhuChe();
		
		
		
	}
	public boolean zhuChe(){
		System.out.println("输入账号：");
		String n=in.next();
		System.out.println("mima");
		String p=in.next();
		Iterator<User> it=ss.iterator();
		if(ss==null){
			ss.add(new User(n,p));
			return true;
		}else while(it.hasNext()){
			if(it.next().getName().equals(n)){
				System.out.println("注册失败");
				return false;
			}
			System.out.println("test");
			
			
		}
		ss.add(new User(n,p));
		System.out.println(ss);
		return true;
	}
	public void dl(){
		System.out.println("输入账号：");
		String n=in.next();
		System.out.println("mima");
		String p=in.next();
		
		for(User u:ss){
			if(!(u.getName().equals(n) && u.getPassword().equals(p))){
				System.out.println("登入失败");
			}
		}
		System.out.println("登入成功");
	}
	public void op(String s){
		if(s.equalsIgnoreCase("a")){
			zhuChe();
		}else if(s.equalsIgnoreCase("b")){
			dl();
		}else System.out.println("输入错误");
	}

}
class User{
	private String name;
	private String password;
	public User(){
		
	}
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
}
