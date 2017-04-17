package com.lzx.mabye;



public class Test1 {

}
class A{
	int a;
	public void get(int a){
		this.a=a;
	}
}
class B{
	int b=0;
	A a=new A();
	public void get(int k){
		a.get(this.b);//this指代当前类的对象，不是调用这个方法的对象；
	}
	
}