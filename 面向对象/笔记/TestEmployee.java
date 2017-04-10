package com.lzx.op.origin;

public class TestEmployee {
	public static void main(String[] args){
		Employee[] e=new Employee[2];
		e[0]=new Employee("a1",22,1200);
		e[1]=new Employee("a2",21,1200);
		Employee m=new Manager("a3",33,1000);
		System.out.println(e[0].toString());
		System.out.println(m.toString());//???
		System.out.println(m.salm());
		//Manager s=new Employee();
		//m.test();不能调用Employee中没有的方法；
		
	}

}
