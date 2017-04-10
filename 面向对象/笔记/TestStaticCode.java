package com.lzx.op.origin;
/*静态static;静态方法随着类的加载而加载；
 * 静态变量存储在方法区的静态区中;而且同一个类下，不同对象的同名的static变量共享相同的值（被类的所有对象共享）；
 * 静态方法块请看Daimakuai类；
 * 通常一个普通类不允许声明为静态的，只有一个内部类才可以。
 * 这时这个声明为静态的内部类可以直接作为一个普通类来使用，而不需实例一个外部类。
 * 
 * */
 public class TestStaticCode{
public static void main(String[] args){
		
		StaticCode.stMd1();//使用静态方法只要类名.静态方法名；
		System.out.println("a:"+StaticCode.stMd2()+" a+b:"+StaticCode.stMd3(3, 4));
		
		System.out.println("x:"+StaticCode.x+" a:"+StaticCode.a+" y:"+StaticCode.y);
		//注意：不是同一个类下所有的static变量共享相同的值；
		StaticCode sc=new StaticCode(2,3);
		StaticCode sc1=new StaticCode(4,5);
		sc.a=6;
		System.out.println("x:"+sc.x+" sc.a:"+sc.a+"sc1.a"+sc1.a+" y:"+sc.y);
		sc.a++;
		System.out.println("x:"+sc.x+" sc.a:"+sc.a+"sc1.a"+sc1.a+" y:"+sc.y);
		//而是同一个类下，不同对象的同名的static变量共享相同的值；
	}
}
class StaticCode {
	 static final double PI=3.14;//声明一个全局常量；
	
	static int x=5;
	static int a;
	 static double y;
	int b;
	public StaticCode(){
		
	}
	public StaticCode(int a,int b){
		this.x=a;
		this.y=b;
	}
	public void test(){//非静态方法；
		System.out.println("这只是一个测试");
	}
	static void stMd1(){
		
		System.out.println("第一个静态方法的输出");
	}
	static int stMd2(){
		//test();静态方法只能调用静态方法；
		stMd1();
		//this.a;静态方法不能使用this，super
		//return b;只能含有静态变量；
		return a;
	}
	public static int stMd3(int a,int b){
		return (a+b);
	}

}
