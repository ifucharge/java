package com.lzx.data;
import java.util.*;
public class StuData {
	
	private Map<Integer,Student> mm=new TreeMap<>();
	{
		mm.put(1,new Student("qq",true,12,"1Ban",66));
		mm.put(3,new Student("aa",true,16,"1Ban",95));
		mm.put(2,new Student("kk",false,14,"1Ban",94));
	}
	public Map<Integer,Student> getMap(){
		return mm;
	}
	

}
