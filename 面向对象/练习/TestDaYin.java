package com.lzx.op.lianxi;
/*多态和继承练习
 * */
public class TestDaYin {
	public static void main(String[] args) {
		DaYin d1=new HbDaYin();
		DaYin d2=new CsDaYin();
		Person2 p=new Person2();
		p.shiyong(d1);
		p.shiyong(d2);
	}

}
class DaYin{
public void dayin(){
	System.out.println("hello world!");
}	
}
class HbDaYin extends DaYin{
	public void dayin(){
		System.out.println("这是黑白的hello world!");
	}
	
}
class CsDaYin extends DaYin{
	public void dayin(){
		System.out.println("这是彩色的hello world!");
	}
	
}
class Person2{
	public void shiyong(DaYin dy){
		dy.dayin();
	}
}
