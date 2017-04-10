package com.lzx.op.origin;
/*final;final修饰的变量必须显示的赋值，且不能修改；
 * */
public class FinalCode extends FuFinalCode{
	public static void main(String[] args){
		String m="WWW";
		String n="EEE";
		final String m1="WWW";
		final String n1="EEE";
		String mn1=m+n;//在编译后为"WWWEEE";
		String mn=m+n;//在编译后仍然为m+n两个变量；（暂时不要求）		
		FinalCode fc=new FinalCode();
		System.out.println(fc.a);
		fc.fiMd(2.0);
		final ZzFinalCode zfc=new ZzFinalCode();
		// final修饰变量后导致的“宏替换”/"宏变量"问题:
		//zfc=new ZzFinalCode();final修饰的对象无法再次创建堆内存空间（即地址值无法改变）；
		zfc.y=2;//final修饰的对象可以对其堆空间中的值做出改变。
		System.out.println(zfc.y);
		
	}

	public void fiMd(double a){
		System.out.println("dsa");
	}//这个为什么可以？？？没有重写；
	
}

class ZzFinalCode extends FuFinalCode{
	final int x=8;
	int y;
	/*public void fiMd(){
		System.out.println("dsad");
	}
		public final void fiMd(){
		
	}父类的final修饰方法不能重写；
	*/



}
class FuFinalCode{
	//public final int a; final修饰的变量必须显示的赋值
	public final int a=9;

	//a+=1;final修饰的变量不可以被修改；
	public final void fiMd(){
		System.out.println("这是一个final方法测试");
	}
	public final int fiMd(int a){
		System.out.println("第二个final方法测试，传入的参数为"+a);
		return a;
	}
	public void fiMd(int a,int b){
		System.out.println("第三个final方法测试");
	}//由上可知，final修饰的方法可以重载；
}
final class Fu{
	
}
/*class Zzi extends Fu{
	
}final修饰的类无法被继承；
*/