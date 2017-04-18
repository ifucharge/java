package com.lzx.collectionbiji;
import java.util.*;
/*set集合：无序不可重复集合；是否相同根据euqals方法判断；
 * 实现类：HashSet，LinkedHashSet，TreeSet
 * */
public class TestSet {
	public static void main(String[] args) {
		Set ss=new HashSet();
		Set ss1=new HashSet();
		Set ss2=new LinkedHashSet();
		Set ss3=new TreeSet();
		Set ss4=new TreeSet();
		
		ss.add("123");
		ss.add("234");
		ss.add("abc");
		ss.add("bcd");
		ss.add("bcd");
		System.out.println(ss);
		ss1.add(new Person("m1",11));
		ss1.add(new Person("m1",11));
		ss1.add(new Person("m1",11));
		//System.out.println(ss1);//当没有重写equals方法和hashcode方法，判定为不同对象；
		System.out.println(ss1);
		ss2.add("222");
		ss2.add("233");
		ss2.add("244");
		ss2.add("222");
		ss2.add("255");
		ss2.add("266");
		System.out.println(ss2);
		/*LinkedHashSet 集合根据元素的 hashCode 值来决定元素的存储位置，但它同时使用链表维护元素的次序，这使得元素看起来是以插入顺序保存的。
		LinkedHashSet 性能插入性能略低于 HashSet，但在迭代访问 Set 里的全部元素时有很好的性能。
		LinkedHashSet 不允许集合元素重复。*/
		
		ss3.add("asd");
		ss3.add("dsd");
		ss3.add("csd");
		ss3.add("bsd");
		System.out.println(ss3);//按自然排序排列（升序）；
		ss4.add(new Person("cc",11));
		ss4.add(new Person("dd",11));
		ss4.add(new Person("kk",11));
		ss4.add(new Person("aa",11));
		System.out.println(ss4);//当自定义的类没有实现Comparable接口时会类型转换异常；
		DingyiSort ds=new DingyiSort();
		ss4=new TreeSet(ds);
		ss4.add(new Person("cc",11));
		ss4.add(new Person("dd",11));
		ss4.add(new Person("kk",11));
		ss4.add(new Person("aa",11));
		System.out.println("比较器排序："+ss4);

		
		
	}

}
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(){
		
	}
	public Person(String name, int age) {
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
		return "[name:"+this.name+" age:"+this.age+"]";
	}
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
/*	@Override
	public int compareTo(Object o) {//泛型当实现的接口指定了泛型时，这里传入的参数类型就和泛型一样。
		
		return this.name.compareTo(o.getName());
	}*/
	/**
	 * 当前对象的属性与传入对象属性的比较
	 * 当返回结果大于0时：正序排列
	 * 当返回结果为0时，认为是重复元素
	 * 当返回结果小于0时，倒序排列
	 */
	@Override
	public int compareTo(Person o) {
		int num=this.age-o.age;
		// TODO Auto-generated method stub
		//return this.name.compareTo(o.getName());按照姓名升序排列
		
		int num2=num==0?this.name.compareTo(o.getName()):num;
		
		return num2;//先是按照年龄排列，年龄相同时在按照姓名排列；
	}
	
}

class DingyiSort implements Comparator<Person>{
	public int compare(Person p1,Person p2){
		return p1.getName().compareTo(p2.getName());
	}
	
}
