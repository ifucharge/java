package com.lzx.op.origin;
/*代码块：
 * */
public class Daimakuai {
	static{
		System.out.println("静态代码块");
		
	}
	public static void main(String[] args) {
	
		GouZhao gz=new GouZhao();
		GouZhao gz1=new GouZhao(1,2);
		System.out.println("-----------分割----------------");
		Jingtai jt=new Jingtai();
		
		
		
	}
	public void jbD(){
		{//局部代码块，限定变量的生命周期（局部代码块定义的变量只在局部代码块有效）
			int a=0;
			System.out.println(a);
		}
		//System.out.println(a);
	}

}
class GouZhao{
	private int a;
	private int b;
	{/*构造代码块在类中，在方法外部，
	作用：把多个构造器中相同的代码写到代码块中，每一次构造器执行，代码块也会执行，可以减少代码的重复。
	而且构造代码快的内容要先于构造器的执行。
	*/
		System.out.println("这是构造代码块的内容");
	}
	public GouZhao(){
		System.out.println("第一个构造器");
	}
	public GouZhao(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("第二个构造器");
	}
}
class Jingtai{
	{
		System.out.println("构造代码块的内容");
	}
	public Jingtai(){
		System.out.println("构造器");
	}
	static {/*在类中方法外出现，加了static修饰。
		用于给类进行初始化，在加载的时候就执行，并且只执行一次。
		而且优先于main方法的执行；
		*/
		System.out.println("这是静态代码块的内容");
	}
	
}
