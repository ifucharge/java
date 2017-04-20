package com.lzx.collectionbiji;
/*List有序,可重复集合的接口；
 * 重要的子类(实现类):
				ArrayList --->80%：底层数据结构是数组，查询快，增删慢。
                                                                                          线程不安全，效率高。（查询多用这个）
				LinkedList： 底层数据结构是链表，查询慢，增删快。
  							线程不安全，效率高。（增删多用这个）
				Vector：底层数据结构是数组，查询快，增删慢。
                 		线程安全，效率低。（要安全用这个）
List 代表一个元素有序、且可重复的集合，集合中的每个元素都有其对应的顺序索引.
List 允许使用重复元素，可以通过索引来访问指定位置的集合元素。
List 默认按元素的添加顺序设置元素的索引。
List 集合里添加了一些根据索引来操作集合元素的方法

ArrayList特有方法clone();void removeRange(index1,index2)移除index1和index2之间的元素；
trimToSize() 将此 ArrayList 实例的容量调整为列表的当前大小。

 * */
import java.util.*;
public class TestList {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List li1=new ArrayList();
		LinkedList<String> li2=new LinkedList<>();
		li1.add("213");
		li1.add("111");
		li1.add("213");
		li1.add("333");
		li1.add(0,"000");//算是插入了；
		System.out.println(li1);
		Collections.sort(li1);//对于List集合自然排序；
		System.out.println(li1);
		System.out.println("-=--------------------------");
		System.out.println(li1.indexOf("333"));//返回第一次出现该对象的索引；
		System.out.println(li1.get(0));//得到指定索引的元素；
		System.out.println(li1.set(1, "222"));//指定位置替换指定元素；
		System.out.println(li1);
		li1.remove(0);//删除指定索引的元素；
		System.out.println(li1);
		System.out.println(li1.subList(0, 2));//截取集合，包前不包后；
		
		for(int i=0;i<TestList.pl3(li1).length;i++){
			System.out.print(TestList.pl3(li1)[i]+" ");
		}
		
		TestList.pl4(li1,"213","???");
		System.out.println(li1);
		
		li2.addFirst("123");
		li2.addFirst("wqe");
		li2.addFirst("zxc");//把指定对象添加到集合开头；
		li2.offer("0000");//把指定对象添加到集合末尾；
		System.out.println(li2);
		
		
		
		
	}
//for循环遍历List集合
	public static void pl1(List l){
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
//普通迭代器遍历
	public static void pl2(List l){
		Iterator it=l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
//列表迭代器遍历
/*ListIterator listIterator()：List集合特有的迭代器
 *   该迭代器继承了Iterator迭代器，所以，就可以直接使用hasNext()和next()方法。
 * 
 * 特有功能：
 *   Object previous():获取上一个元素
 *   boolean hasPrevious():判断是否有元素
 *   void add();添加的元素跟在next()得到的元素后
 *   void set(E e);设置的元素替换next到的元素；
 *   void remove();删除next到的元素
 * 
 *   注意：ListIterator可以实现逆向遍历，但是必须先正向遍历，才能逆向遍历，所以一般无意义，不使用。

 * */
	public static String[] pl3(List l){
		int i=0;
		String[] s=new String[l.size()];
		ListIterator lit=l.listIterator();
		while(lit.hasNext()){
			s[i]= (String)lit.next();
			i++;
		}
		return s;
	}
//判断List集合是否有某个元素,再用指定元素替换它；
	public static void pl4(List l,String s,String s1){
		ListIterator lit=l.listIterator();
		while(lit.hasNext()){
			if(lit.next().equals(s)){
				lit.set(s1);				
			}
		}
		
	}
	

}
