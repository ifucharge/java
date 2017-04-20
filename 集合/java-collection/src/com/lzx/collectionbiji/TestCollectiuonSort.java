package com.lzx.collectionbiji;
import java.util.*;
/*总结一下集合的排序
 * 
 * */
public class TestCollectiuonSort {
	public static void main(String[] args) {
		Collection<Student> coll=new ArrayList<Student>();
		coll.add(new Student("a1",16));
		coll.add(new Student("a2",14));
		coll.add(new Student("a3",11));
		coll.add(new Student("a4",12));	
		int s=0;
		Student[] stu1=new Student[coll.toArray().length];
		for(Object ob:coll.toArray()){
			stu1[s]=(Student)ob;
			s++;
		}//直接coll.toArray()再用Student[]去装,再强转,会报类型转换异常；
		 //所以只能遍历数组，在一个个装，一个个强转；
		for(int i=0;i<stu1.length;i++){
			for(int j=i+1;j<stu1.length;j++){
				if(stu1[i].getAge()>stu1[j].getAge()){
					TestCollectiuonSort.exchange(stu1, j, i);
				}				
			}
		}
		/*for(Student st:stu1){
			System.out.println(st);
		}*/		
		List<Student> li=new ArrayList<>();
		li=Arrays.asList(stu1);
		System.out.println(li);
	}
	/*
	 * 蛋疼的写了个实现Collection接口的对象排序，如果用Collection的方法要排序集合好像只能这样了；
	 * */
	
	
	
	public static void exchange(Student[] stu,int i,int j){
		Student t=null;
		t=stu[i];
		stu[i]=stu[j];
		stu[j]=t;		
	}

}
//自定义比较器(该类实现Comparator接口，重写compareTo方法)：
class MyCompare implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o2.getAge()-o1.getAge();
	}
	
	
}
