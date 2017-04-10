package com.lzx.op.origin;
/*接口：接口是一个标准；其中的抽象方法只能是public方法就能理解了；
 * 
 * 
 * */
public class TestInterface {
	public static void main(String[] args){
		A a1=new Ab();
		A a2=new Ac();
		a1.m11(1);
		a1.m3();
		a2.m11(1);
		a2.m3();
		
	}

}
interface A{
	//public final static double PI=3.14;//可以有常量；
	double PI=3.14;//简写；
	//public int a;接口不能定义属性；
	//public A(){
		
	//}接口不能有构造方法，属性都没有，初始化也没必要；
	//public void m1(){
		
	//}不能有普通方法；
	public static void m2(){
		
	}//可以有静态方法；
	public abstract void m11(double a);
	public abstract void m3();
     default void m6(int a){
    	 System.out.println("接口A的默认方法");
    	 int b;
     }//在jdk1.8后接口可以有默认方法（明确添加default）；
	
}
interface B{
	public abstract int m11(int a);
	public abstract int m4();
	int m5();//简化；
	//public abstract int m4()=public int m4();=int m4();
	//接口的抽象方法只有public的类型；
	default void m6(int a){
   	 System.out.println("接口B的默认方法");
   	 int b;
    }
}
//接口的实现;
//抽象类不必实现接口的抽象方法；
abstract class Aa implements A{
	
}


class Ab implements A,B{
	//普通类需要和抽象类一样实现所有的抽象方法；
	public void m11(double a){//在两个接口有同名不同返回值类型时，一个类实现这两个接口时
		             //只能通过参数的类型和数量加以区分；
		             //如果是两个接口的同名方法只是返回值类型不同，则编译出错，
		             //一定要解决的话（在Ab中搞两个内部类分别包住这两个方法？？？）？？？
		
	}
	public int m11(int a){
		System.out.println("Ab实现的m1方法");
		return 1;
	}
	public void m3(){
		System.out.println("Ab实现的m3方法");
	}
	public int m4(){
		return 5;
	}
	@Override
	public int m5() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void m6(int a) {
		// TODO Auto-generated method stub
		A.super.m6(a);
	}//在一个类实现两个接口时，而这两个接口有同名的默认方法时要指定重写该方法；
}
class Ac implements A{
	public void m11(double a){
		System.out.println("Ac实现的m1方法");
	}
	public void m3(){
		System.out.println("Ac实现的m3方法");
	}
}

