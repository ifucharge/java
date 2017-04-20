package com.lzx.collectionbiji;
import java.util.*;
import java.util.Map.Entry;
/*Map排序：
 * */
//HashMap的初始顺序是按照key的hash值来的；
//要对HashMap的key排序可以把HashMap的元素存入TreeMap中
//对value排序则和TreeMap一样；这里就写TreeMap了
public class TestCollectionSort3 {
	public static void main(String[] args) {
		Map<Integer,Student> mm=new TreeMap<>();
		mm.put(2,new Student("mm1",26));
		mm.put(1,new Student("mm2",23));
		mm.put(5,new Student("mm3",21));
		mm.put(4,new Student("mm4",25));
//根据key排序；
		System.out.println(mm);//默认按key的自然排序；
		Map<Integer,Student> mm2=new TreeMap<>(new Comparator<Integer>(){
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;//按照key定制排序；
			}
		});
		mm2.putAll(mm);
		System.out.println(mm2);
//根据value排序：
		List<Map.Entry<Integer,Student>> li=new ArrayList<>(mm.entrySet());
		//先使用mm.entrySet()获得Set的键值集合，传入ArrayList构造器得到List的键值集合；
		Collections.sort(li,new Comparator<Map.Entry<Integer,Student>>(){
        //使用sort方法，定制排序；就是输出的类型变为了List
			@Override
			public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
				return o2.getValue().getAge()-o1.getValue().getAge();
			}
			
		});
		System.out.println(li);
	
		
	}

}
