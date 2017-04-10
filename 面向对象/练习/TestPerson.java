package com.lzx.op.lianxi;
/*构造器练习；
 * */
public class TestPerson {
	public static void main(String[] args) {
		Person1 per=new Person1("a1",10);
		System.out.println("name:"+per.name+" age:"+per.age);
		Person1 per2=new Person1("a2",11,"jkl");
		System.out.println("name:"+per2.name+" age:"+per2.age+" school:"+per2.school);
		Person1 per3=new Person1("a3",14,"jkle","asd");
		System.out.println("name:"+per3.name+" age:"+per3.age+" school:"+per3.school+" major:"+per3.major);
		
	}

}
class Person1{
	public String name;
	public int age;
	public String school;
	public String major;//懒得封装了；
	public Person1(){
		
	}
	public Person1(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person1(String name,int age,String school){
		//this();
		this(name,age);
		this.school=school;	
	}
	public Person1(String name,int age,String school,String major){
		this(name,age,school);
		this.major=major;
		
	}
}
