package com.lzx.collectionbiji;

import java.util.*;
/*Map接口下的主要方法；
 * */
public class TestMap {
	public static void main(String[] args) {
		Map<Integer,String> mm=new HashMap<>();
		mm.put(1, "ww");
		mm.put(2,"bb");
		mm.put(4,"ss");
		mm.put(1, "kk");//键值不可重复，重复的话会覆盖，内容可以
		mm.put(3,"kk");
		System.out.println(mm);
		mm.remove(2);//依据键值删除数据；
		System.out.println(mm.containsKey(1));//是否包含指定的键值，
		System.out.println(mm.containsValue("ss"));//是否包含指定的值；
		System.out.println(mm.keySet());//获取键的视图；
		System.out.println(mm.entrySet());//获取键-值的视图；
		System.out.println(mm.values());//获取值的视图；
		System.out.println("------------------------------------------------");
		//上面的仅仅是视图，下面就是遍历
		Set<Integer> ss=mm.keySet();
		for(Integer i:ss){
			System.out.print(" "+i+"\n");
		}//对于键值对象的遍历；
		Collection<String> li=mm.values();//要用Collection不能用List
		for(String s:li){
			System.out.print(" "+s+"\n");
		}//对于值对象的遍历；
		
		Set<Integer> ss1=mm.keySet();
		for(Integer i:ss1){
			String s=mm.get(i);//由键得到值；
			System.out.println(i+"-"+s+" ");
		}//遍历键值和值；
System.out.println("--------------------------------------");		
		Set<Map.Entry<Integer,String>> ss2=mm.entrySet();
		for(Map.Entry<Integer,String> m:ss2){
			System.out.print("\n"+m.getKey());//获取键值
			System.out.print("-"+m.getValue());//获取值；
		}
		
		
	}

}
