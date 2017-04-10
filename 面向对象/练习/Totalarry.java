package com.lzx.op.lianxi;

public class Totalarry {
	public static void main(String[] args){
		int[] a={1,2,3,4,5};
		Totalarry to=new Totalarry();
		System.out.println(to.sum(a));
		
	}
	public int sum(int[] a){
		int s=0;
		for(int i=0;i<a.length;i++){
			s+=a[i];
		}
		return s;
	}

}
