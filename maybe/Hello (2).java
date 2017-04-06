package com.lzx;
/*多态加深：
 * */
public class Hello{
	public static void main(String[] args) {
		A a1=new A();
		B b1=new B();
		C c1=new C();
		A a2=new B();
		a1.shows(c1);
		a2.shows(c1);
		b1.shows(c1);
		c1.shows(a1);
		c1.shows(b1);
	}

}
class A{
	public void shows(A a){
		System.out.println("AA");
	}
	public void shows(B b){
		System.out.println("AB");
	}
	//public void shows(C c){
	//	System.out.println("AC");
	//}传入引用参数时自动选择离自己相近的对象；
}
class B extends A{
	public void shows(A a){
		System.out.println("BB1");
	}
	public void shows(B b){
		System.out.println("BB2");
	}
	
}
class C extends B{
	public void shows(C c){
		System.out.println("C");
	}
}
