package com.lzx.collectionbiji;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//import java.util.*;
/*Collection接口的功能；
 * */
public class TestCollection {
	public static void main(String[] args) {
		//AbstractCollection
		Collection coll=new ArrayList();
		Collection coll1=new ArrayList();
//1.添加功能		
		coll.add("qwe");//添加一个元素（对象），集合只能存储引用数据类型；
		coll.add("asd");
		coll.add("zcx");
		System.out.println(coll);//输出各个对象，重写了toString；
		coll1.addAll(coll);//传入一个集合对象；
		System.out.println(coll1);
		coll1.add("123");
		coll.add("567");
		
//2.删除功能
		//coll.clear();
		//System.out.println(coll);//清空；
		coll.remove("qwe");//删除指定的对象；
		System.out.println(coll);
		//System.out.println(coll1);
		coll1.removeAll(coll);//删除coll1里面coll1和coll交集的部分；
		System.out.println(coll1);
//3.判断功能
		System.out.println(coll1.contains("123"));
		//判断coll1是否含有指定的元素
		//(底层是调用euqals方法来比较)(再存入自定义对象进集合时，一般会改写自定义类的equals())
		System.out.println(coll1.containsAll(coll));//coll1是否包含指定集合；
		System.out.println(coll.isEmpty());//判断集合是否为空；
System.out.println("------------------------分割---------------------------");
//4.获取功能
//集合遍历；
/*迭代器：一个接口:Iterator,
方法hasNext();如果集合还有元素则返回true；
方法next();获取元素
而collection里面有Iterator方法来获得迭代器；
注意：仅用于遍历集合，Iterator 本身并不提供承装对象的能力。
如果需要创建 Iterator 对象，则必须有一个被迭代的集合。*/
        Iterator it=coll1.iterator();
        while(it.hasNext()){
        	String s=(String)it.next();//next(),返回object类型；
        	System.out.println(s);
        }
//toArray();
        Object[] o=coll.toArray();//返回一个Object类型；
        for(int i=0;i<o.length;i++){
        	String s=(String)o[i];
        	System.out.print(s+" ");
        }
 //5.其他功能：
        System.out.println(coll.size());//获取集合元素的个数；
        System.out.println(coll1.retainAll(coll));//判断是否有交集；
      

		
		
		
		
	}

}
