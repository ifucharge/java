package com.lzx.mabye;



/*类中的成员变量为另一个类类型的数组
 * */
public class Demo1{

	public static void main(String[] args) {
		Datac da=new Datac(new Student[5]);		
		Student[] st=new Student[5];
		System.out.println(st[1]);
		System.out.println(da);
		for(int i=0;i<da.stu.length;i++){
			System.out.println(da.stu[i]);
		}
		Student st1=new Student("aa",23);
		System.out.println(st1);//输出对象名就是输出对象名.toString();
		
		

	}

	
}
class Student{
	private String name;
	private int age;
	public Student(){
		
	}
	public Student(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
		
}


class Datac{
	Student[] stu;
	public Datac(){
		
	}
	public Datac(Student[] stu){
		this.stu=stu;
		stu[0]=new Student("a1",11);
		stu[1]=new Student("a2",12);
		stu[2]=new Student("a3",13);
		stu[3]=new Student();
		
	}
	
	
}
