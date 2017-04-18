package com.lzx.collectionlianxi;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListLianxi {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("wqe");
		al.add("weq");
		al.add("1");
		al.add("1");
		al.add("1");
		System.out.println(al);
		ArrayListLianxi.reList(al);
		System.out.println(al);
		
		
	}
	//去除List集合里的重复元素；
	public static void reList(List<String> l){
		int m=0;
		for(int i=0;i<l.size();i++){
			
			for(int j=i+1;j<l.size();j++){
				if(l.get(i).equals(l.get(j))){
					l.remove(j);
					j--;
				}
				
				
			}
		}
		
	
	
	}

}
