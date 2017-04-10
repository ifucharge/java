package com.lzx.op.lianxi;
/*方法的重载练习；
 * */
public class TestDemo3 {
	public static void main(String[] args) {
		String a="test tst";
		Demo3 deo=new Demo3(1,2);
		System.out.println("a^2:"+deo.mOL(deo.geta())+"\na+b:"+deo.mOL(deo.geta(),deo.getb())+"\nmax(a,b):"+deo.max(deo.geta(),deo.getb() ));
		System.out.println(deo.mOL(a));
		deo.setA1(4);
		deo.setB1(5);
		deo.setC1(6);
		System.out.println("max(a,b,c):"+deo.max(deo.getA1(),deo.getB1(),deo.getC1()));
		
		
		
	}

}
class Demo3{
	private int a;
	private int b;
	private double a1;
	private double b1;
	private double c1;
	public Demo3(){
		
	}
	public Demo3(int a,int b){
		this.a=a;
		this.b=b;
	}
	public int geta(){
		return this.a;
	}
	public void seta(int a){
		this.a=a;
	}
	public int getb(){
		return this.b;
	}
	public void setb(int b){
		this.b=b;
	}
	
	public double getA1() {
		return a1;
	}
	public void setA1(double a1) {
		this.a1 = a1;
	}
	public double getB1() {
		return b1;
	}
	public void setB1(double b1) {
		this.b1 = b1;
	}
	public double getC1() {
		return c1;
	}
	public void setC1(double c1) {
		this.c1 = c1;
	}
	public int mOL(int a){
		return a*a;
	}
	public int mOL(int a,int b){
		return a*b;
	}
	public String mOL(String a){
		return a;
	}
	public int max(int a,int b){
		return a>b?a:b;
	}
	public double max(double a,double b){
		return a>b?a:b;
	}
	public double max(double a,double b,double c){
		return (a>b?a:b)>c?(a>b?a:b):c;
	}
}
