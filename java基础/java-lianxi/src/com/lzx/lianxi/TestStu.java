package com.lzx.lianxi;
import java.util.*;
public class TestStu {
	public static void main(String[] args) {
		List<Person> li=new ArrayList<>();
		li.add(new Person("a1",22,"男","1234565"));
		li.add(new Person("a2",25,"男","2234565"));
		li.add(new Person("a3",23,"男","3234565"));
		li.add(new Person("a4",21,"男","1234365"));
		Myc myc=new Myc();
		Collections.sort(li,myc);
		
		System.out.print(li);
		
	}

}
class Myc implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o2.getAge()-o1.getAge();
	}
	
}
