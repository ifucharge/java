package com.lzx.manager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.lzx.data.StuData;
import com.lzx.data.Student;

public class StudentManager {
	public static void main(String[] args) {
		StudentManager ss=new StudentManager();
		ss.findStu();
		ss.addStu("000",true,0,"0000",0);
		ss.findStu();
		ss.alterStu(1,88);
		ss.findStu();
		System.out.println("----------------------------------");
		ss.deleteStu(2);
		ss.findStu();
		System.out.println("------------------------------");
		ss.checkStu1(3);
		System.out.println("------------------------------");
		ss.sortStu();
		//ss.findStu();
		System.out.println("\n------------------------------");
		
		
	}//测试一下；
	StuData sd=new StuData();
	public void findStu(){
		Map<Integer,Student> mm=sd.getMap();
		Set<Map.Entry<Integer,Student>> ss=mm.entrySet();
		for(Map.Entry<Integer,Student> m:ss){
			System.out.print(m.getKey());
			System.out.println("	 "+m.getValue());
		}
	}
	public boolean addStu(String name,boolean sex,int age,String className,int score){
		Map<Integer,Student> mm=sd.getMap();
		mm.put(mm.size()+1,new Student(name,sex,age,className,score));
		return true;
	}
	public void alterStu(int id,String name){
		Map<Integer,Student> mm=sd.getMap();
		
		Set<Map.Entry<Integer,Student>> ss=mm.entrySet();
		for(Map.Entry<Integer,Student> m:ss){
			if(m.getKey()==id){
				m.getValue().setName(name);
			}
		}
	}
	public void alterStu(int id,int age){
		Map<Integer,Student> mm=sd.getMap();
		
		Set<Map.Entry<Integer,Student>> ss=mm.entrySet();
		for(Map.Entry<Integer,Student> m:ss){
			if(m.getKey()==id){
				m.getValue().setAge(age);
			}
		}
	}
	public void alterStu(int id,boolean sex){
		Map<Integer,Student> mm=sd.getMap();
		
		Set<Map.Entry<Integer,Student>> ss=mm.entrySet();
		for(Map.Entry<Integer,Student> m:ss){
			if(m.getKey()==id){
				m.getValue().setSex(sex);
			}
		}
	}
	public boolean deleteStu(int id){
		Map<Integer,Student> mm=sd.getMap();
		if(checkStu(id)){
			mm.remove(id);
			return true;
		}
		return false;
	}
	public boolean checkStu(int id){
		Map<Integer,Student> mm=sd.getMap();
		Set<Map.Entry<Integer,Student>> ss=mm.entrySet();
		for(Map.Entry<Integer,Student> m:ss){
			if(m.getKey()==id){
				//System.out.print(m.getKey());
				//System.out.println("      "+m.getValue());
				//这个方法专门给上一个方法使用；
				return true;
			}
		}
		return false;
	}
	public boolean checkStu1(int id){
		Map<Integer,Student> mm=sd.getMap();
		Set<Map.Entry<Integer,Student>> ss=mm.entrySet();
		for(Map.Entry<Integer,Student> m:ss){
			if(m.getKey()==id){
				System.out.print(m.getKey());
				System.out.println("      "+m.getValue());
				return true;
			}
		}
		return false;
	}
	public void sortStu(){
		Map<Integer,Student> mm=new TreeMap<>();
				mm.putAll(sd.getMap());
		List<Map.Entry<Integer,Student>> ts=new ArrayList<Map.Entry<Integer,Student>>(mm.entrySet());
		
		Collections.sort(ts,new Comparator<Map.Entry<Integer,Student>>(){

			@Override
			public int compare(Entry<Integer, Student> o1, Entry<Integer, Student> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().getScore()-o1.getValue().getScore();
			}
			
		});
	    for(Map.Entry<Integer,Student> mp:ts){
	    	System.out.print("\n"+mp.getKey());
	    	System.out.print("    "+mp.getValue());
	    }
		
	}
	

}
