package com.lzx.op.origin;
/*抽象类：1。abstract修饰2.不一定要有抽象方法，可以有成员变量，构造器，普通方法；有抽象方法就一定得是abstract类
 * 3.子类若不是抽象方法，则一定实现所有抽象方法。
 * 4.抽象类的实例化其实是靠具体的子类实现的。是多态的方式。
 * 5.abstract不能和static final private一起使用。

 * */
public class TestAbstruct {
	public static void main(String[] args) {
		//Abt1 ab=new Abt1();抽象方法无法实例化；
		Abt2 ab=new Zbt(); //抽象方法通过多态的方式实现；
		ab.m2();
		
	}

}
abstract class Abt1{
	private int a;
	private int b;//可以设置成员变量；
	public Abt1(){
		
	}
	public Abt1(int a,int b){
		this.a=a;
		this.b=b;
	}//可以有构造器；
	public void m1(){
		System.out.println("abstract类的方法1");
	}//可以有非抽象方法；可以没有抽象方法；
}
abstract class Abt2{
	public  abstract  void m2();//抽象方法不用{};
	public abstract int m3();//
	public abstract int m3(int a);//抽象方法的重载，在继承时全部的重载方法都得重写；
	public abstract int m4();
}

class Zbt extends Abt2{
	//抽象类的子类必须实现父类的抽象方法，否则只能把子类申明为abstract；
	public void m2(){
		System.out.println("实现了抽象方法的子类m2");
	}
	public int m3(){
		return 0;
	}
	public int m3(int a){
		return a;
	}
	public  int m4(){
		return 0;
	}
}

