package com.lzx.collectionbiji;
import java.util.*;
/*list和Set的排序；
 * */
public class TestCollectionSort2 {
	public static void main(String[] args) {
		List<Student> li=new ArrayList<>();
		li.add(new Student("l1",16));
		li.add(new Student("l2",14));
		li.add(new Student("l3",11));
		li.add(new Student("l4",12));	
		Set<Student> ss=new HashSet<>();
		ss.add(new Student("s1",16));
		ss.add(new Student("s2",14));
		ss.add(new Student("s3",11));
		ss.add(new Student("s4",12));
//List的排序方式；		
/*1.自己写的对List集合的排序		
 * for(int i=0;i<li.size();i++){
			for(int j=i+1;j<li.size();j++){
				if(li.get(i).getAge()>li.get(j).getAge()){
					TestCollectionSort2.exE(li, i, j);
				}
			}
		}
		System.out.println(li);
	}	
	public static void exE(List<Student> li,int i,int j){
		Student t;
		t=li.get(i);
		li.set(i,li.get(j));
		li.set(j,t);		
	}*/
//2.利用实现Comparable接口，重写compareTo()方法，再通过Collections.sort来排序；
/*	Collections.sort(li);;
	System.out.println(li);*/
//3.通过自定义比较器来排序；
		MyCompare mc=new MyCompare();
		Collections.sort(li,mc);
		System.out.println(li);
		System.out.println("------------------------------------------");
//----------------------------------------------------------------------------------

//HashSet的排序方式
//(在add元素时，HashSet集合里是按照hash值排序的,1方式只可以转变为List，最终的类型变了，推荐2方法)；
//1.把Set里的元素放到List集合里，调用Collections.sort方法；
		List<Student> li2=new ArrayList<>();
		for(Student stu:ss){
			li2.add(stu);
		}//把Set里的元素放到List集合里.		
		Collections.sort(li2);
		System.out.println(li2);
//2.把HashSet集合的元素存到TreeSet，
		TreeSet<Student> ss2=new TreeSet<>(ss);
		System.out.println(ss2);//自然排序了
	
		//亦或是用比较器；
		TreeSet<Student> ss3=new TreeSet<>(mc);
		ss3.addAll(ss2);
		System.out.println(ss3);
//TreeSet的话本来就是自然排序(add入TreeSet的对象的类都要实现Comparable接口，重写CompareTo())
		TreeSet<Student> ss4=new TreeSet<>(new Comparator<Student>(){
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge()-o2.getAge();
			}			
		});//直接在TreeSet的构造器加入new 泛型接口，重写compare方法，实现定制排序；
		ss4.addAll(ss2);
		System.out.println(ss4);
		
		
	
	

      }
	}
