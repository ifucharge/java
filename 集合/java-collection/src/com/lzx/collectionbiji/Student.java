package com.lzx.collectionbiji;

import java.io.Serializable;

/*作为集合元素的类
 * */
public class Student implements Serializable,Comparable<Student>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
/*Java的序列化机制是通过在运行时判断类的serialVersionUID来验证版本一致性的。在进行反序列化时，
 * JVM会把传来的字节流中的serialVersionUID与本地相应实体（类）的serialVersionUID进行比较，
 * 如果相同就认为是一致的，可以进行反序列化，否则就会出现序列化版本不一致的异常。
 * */
	private String name;
	private int age;
	public Student(){
		
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
		return "[name:"+this.name+"age:"+this.age+"]";
	}
/*	public boolean equals(Student s){
		if(s!=null){
			if(this.name.equals(s.getName())){
				if(this.age==s.getAge()){
					return true;
				}

			}
		}return false;
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		return this.age-o.getAge();
	}
	

}
