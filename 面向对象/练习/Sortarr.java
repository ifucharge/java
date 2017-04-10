package com.lzx.op.lianxi;
import java.util.Arrays;
public class Sortarr {
	public static void main(String[] args){
		int[] a={2,4,5,6,1};
		Sortarr so=new Sortarr();
		System.out.println(Arrays.toString(so.sort(a)));						
	}
public int[] sort(int[] a){
	int min;
	for(int i=0;i<a.length;i++){
		min=i;
		for(int j=i+1;j<a.length;j++){
			if(a[j]<a[min]){
				min=j;				
			}			
		}
		if(min!=i){
			exchange(a,i,min);
		}		
	}
	return a;	
}
public void exchange(int[] a,int i,int j){
	int t;
	t=a[i];
	a[i]=a[j];
	a[j]=t;
}
}

