package com.lzx.op.origin;
/*多态：三个条件：1.继承2.多态3.父类的引用子类的对象（向上转型）；
 * 多态核心体现在方法的重写上，弊端是无法执行子类特有的方法；
 * 要先向上转型在向下转型；
 * 
 * */
public class TestDuoTai {
	public static void main(String[] args){
		FuTai tai1=new ZiTai1();
		FuTai tai2=new ZiTai2();
		FuTai tai3=new T();//
		Object o=new T();//只要是最末端子类重写了父类以上各个类都有的方法，就执行最末端子类的方法；
		tai1.m1();
		tai2.m1();				
        //tai.m2(1.0,2.0);方法没重写就无法执行多态效果；
		FuTaitool.sm(tai1);
		FuTaitool.sm(tai2);
		System.out.println(tai3.toString());
		System.out.println(o.toString());
		//(ZiTai1)tai1.m3();
		ZiTai1 tai11=(ZiTai1)tai1;//向下转型；以使用子类特有的方法；
		tai11.m3();
	}

}
class FuTai{
	int a;
	int b;
	public void m1(){
		System.out.println("父类的方法");
	}
	public int m2(int a,int b){
		return (a+b);
	}
	public String toString(){
		return "fu";
	}
}
class ZiTai1 extends FuTai{
	public void m1(){
		System.out.println("子类1的方法");
	}
	public double m2(double a,double b){
		return (a+b);
	}
	public void m3(){
		System.out.println("这是子类1特有的方法");
	}
}
class ZiTai2 extends FuTai{
	public void m1(){
		System.out.println("子类2的方法");
	}
}
class FuTaitool{
	public static void sm(FuTai futai){
		futai.m1();
	}
	}
class T extends FuTai{
	public String toString(){
		return "zi";
	}
	
}
