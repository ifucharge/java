package com.lzx.collectionbiji;
import java.util.*;
public class TestMap2 {
	public static void main(String[] args) {
		Map<Student1,String> mm=new HashMap<>();
		mm.put(new Student1("kk",11),"111111");
		mm.put(new Student1("ss",13),"211111");
		mm.put(new Student1("aa",12),"311111");
		System.out.println(mm);
		Set<Map.Entry<Student1,String>> ss=mm.entrySet();
		for(Map.Entry<Student1,String> m:ss){
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
		
	/*	Map<String,Integer> mm2=new LinkedHashMap<>();
		mm2.put("bb",123);
		mm2.put("aa",222);
		mm2.put("dd",422);
		System.out.println(mm2);写一下LinkedHashMap试试*/
		
		Map<String,Integer> mm3=new TreeMap<>();
		mm3.put("bb",123);
		mm3.put("aa",222);
		mm3.put("dd",422);
		System.out.println(mm3);//自然排序；
		Map<Student1,Integer> mm4=new TreeMap<>();
		Map<Student1,Integer> mm5=new TreeMap<>();
		Map<Student1,Integer> mm6=new TreeMap<>();
		List<Map> li=new ArrayList<>();
		mm4.put(new Student1("kk",11),2);
		mm4.put(new Student1("ss",13),3);
		mm4.put(new Student1("a1",12),1);
		mm5.put(new Student1("a1",55),1);
		mm5.put(new Student1("a2",55),1);
		mm5.put(new Student1("a3",55),1);
		mm6.put(new Student1("a4",66),1);
		mm6.put(new Student1("a5",66),1);
		mm6.put(new Student1("a6",66),1);
		System.out.println(mm4);
		li.add(mm4);
		li.add(mm5);
		li.add(mm6);
		System.out.println("--------------------------------------------");
		System.out.println(li);
		System.out.println("--------------------------------------------");
		
		for(Map m:li){
			Set<Map.Entry<Student1,Integer>> ss1=m.entrySet();
			for(Map.Entry<Student1,Integer> k:ss1){
				System.out.print("\n"+k.getKey());
				System.out.print("-"+k.getValue());
			}
			System.out.print("\n------------------------");
		}//遍历List含有Map的集合；
		
		
		
		
		
	}

}
class Student1 implements Comparable<Student1>{
	private String name;
	private int age;
	public Student1(){
		
	}
	
	public Student1(String name, int age) {
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

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student1 o) {
		
		return this.name.compareTo(o.name);
	}
	
}
