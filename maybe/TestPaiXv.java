package com.lzx.mabye;
import java.util.Arrays;
public class TestPaiXv {
	public static void main(String[] args) {
		int[] a={2,1,5,4,7,8,9};
		PaiXv px=new PaiXv();
		
		//System.out.println(Arrays.toString(px.cha(a)));
		System.out.println(Arrays.toString(px.mp(a)));
		//System.out.println(Arrays.toString(px.xz(a)));
	}
   
}
class PaiXv{
	 public void exchange(int[] a,int i,int j){
		 int t;
		 t=a[i];
		 a[i]=a[j];
		 a[j]=t;
	 }
	 public int[] mp(int[] a){
	    	for(int i=0;i<a.length;i++){
	    		for(int j=i+1;i<a.length;j++){
	    			if(a[i]>a[j]){
	    				exchange(a,i,j);
	    			}
	    		}
	    	}
	    	return a;
	    }
	 public int[] xz(int[] a){
		 int min=0;
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
	 public int[] cha(int[] a){
		 int get=0;
		 int j=0;
		 for(int i=1;i<a.length;i++){
			 get=a[i];
			 j=i-1;
			 while(j>=0 && a[j]>get){
				 a[j+1]=a[j];
				 j--;
			 }
			 a[j+1]=get;
		 }
		 return a;
	 }
}
