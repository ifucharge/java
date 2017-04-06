package com.lzx.op.origin;

/*方法的重写和重载；
 * 重载：在同一个类中同的同名方法只能1.参数类型不同和2.参数个数不同3.参数类型顺序的不同，
 * 单独返回值不同无法作为重载的依据；
 * 重写：子类和父类的方法要相同的名称和参数（才能和重载区分开来）；
 * 重写的重点在方法里的内容，重载的重点是方法的参数，重载用来识别不同的方法，重写是在继承中用来覆盖父类的方法以实现
 * 多态；
 * 
 * */
public class TestChongZaiXie {
	public static void main(String[] args){
		Z1 z=new Z1();
		F1 z1=new Z1();
		z.m1();
		//z1.m2(3);//父类的对象只能用父类的方法，由于m2加了一个参数，无法重写，加参的m2还是子类的方法。
		z1.m2();//实现了重写
	}

	public void m1() {
		System.out.println("NO.1");
	}

	public void m1(int a) {

	}// 参数个数不同；
	//public int m1(int b){
	//	return b;
	//}参数的名字改变，无法重载；

	public void m1(double a) {

	}// 参数类型不同；
	
	//public int m1(int a){
	//	return a;
	//}单独返回值不同无法作为重载的依据;
	public void m1(String a,int b){
		
	}
	public void m1(int a,String b){
		
	}//参数类型顺序的改变可以重载；
	
	public void m1(int a,int b){
		
	}
	//public void m1(int b,int a){
		
	//}//同类型参数的顺序改变无法构成重载；
}
class F1{
	private int a;	
	private int b;
	public F1(){
		
	}//在继承时，子类默认继承父类的无参构造器，在父类没有提供无参构造函数时，在编译时会报错；
	//解决：1.在父类中添加一个无参构造器；（优选）
	 //   2.在子类中显示的添加父类的有参构造器
	public F1(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	public void m1(){
		System.out.println("父类的m1方法");
	}
	public void m2(){
		System.out.println("父类的m2方法");
	}
	
}
class Z1 extends F1{
	//public Z1(int a,int b){
		
	//}//2.在子类中显示的添加父类的有参构造器,会覆盖父类无参构造器。
	
	public void m1(){
		System.out.println("子类的m1方法");
	}
	public void m2(int a){
		System.out.println("子类的m2方法1");
	}
	public void m2(){
		System.out.println("子类的m2方法2");
	}
	
	
}


