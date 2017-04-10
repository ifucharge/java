package com.lzx.op.lianxi;
/*接口的使用：
 * */
public class TestPerson1 {
	public static void main(String[] args) {
		Company co=new Company();
		Person3 pe=new Person3("张三",22);
		co.zp(pe);
	}
	

}
class Person3 implements Kf,Kc{
	private String name;
	private int age;
	public Person3(){
		
	}
	public Person3(String name,int age){
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

	public String toString(){
		return "姓名："+this.name+" 年龄："+this.age;
	}
	public String kfability(){
		return "开发能力";
	}
	public String kcability(){
		return "驾驶的能力";
	}
}

interface Kf{
	String kfability();
}
interface Kc{
	String kcability();
}
class Company{
	public void zp(Person3 pe){
		System.out.println(pe.toString()+",这个人具有"+pe.kcability()+"和"+pe.kfability());
	}
}


