package com.lzx.op.origin;

public class Dog {
	private String a;
	private int b;
	private double c;
	
	{
		System.out.println("test");
	}
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Dog [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}