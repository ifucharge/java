package com.lzx.collectionlianxi;
/*用集合存储几个学生对象，并把学生对象进行遍历。用迭代器遍历。

 * */
import java.util.*;

import com.lzx.collectionbiji.Student;

public class CollectionLianxi {
	public static void main(String[] args) {
		Collection<Student> co=new ArrayList<>();
		co.add(new Student("m1",11));
		co.add(new Student("m2",12));
		co.add(new Student("m3",12));
		co.add(new Student("m4",12));
		Iterator it=co.iterator();
		while(it.hasNext()){
			Student stu=(Student)it.next();
			System.out.println(stu);
		}
		
		//增强for循环改；(要有泛型)
		for(Student s:co){
			System.out.println(s);
		}
//
		Student st=new Student("m1",11);
		System.out.println(co.contains(st));//这个为false，是因为没有重写Student的equals方法
	}

}
