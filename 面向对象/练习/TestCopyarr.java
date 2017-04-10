package com.lzx.op.lianxi;

public class TestCopyarr {
	public static void main(String[] args){
		Copyarr co=new Copyarr();
		int[] a={1,2,3,4,5};
		int[] b;
		b=co.copy(a.length, a);
		for(int i=0;i<a.length;i++){
			System.out.println(b[i]);
		}
	}
	

}
