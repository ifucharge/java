package com.lzx.op;
import com.lzx.Hello;

/*����������:
 * */
public class Demo1{
	  public static void main(String[] args){
		Hello he=new Hello();
	    int n1=1;
	    int n2=2;
	    double d1=5.5;
	    double d2=1.1;
	    System.out.println(he.mql(n1,n2));
	    System.out.println(he.mql(n1));
	    System.out.println(he.mql(d1,d2));
	  }
	  public  int mql(int a,int b){
	    return (a+b);
	  }
	  public double mql(double a,int b){
		  return (a-b);
	  }
	  public double mql(double a,double b){//1.�������Ͳ�ͬ��
	    return a/b;
	  }
	  public int mql(int a){//2.����������ͬ��
	    return a*a;
	  }
	  //public void mql(int a,int b){	  
	  //}����ע�⣺�����������ȫ��ͬ��ֻ�Ƿ���ֵ��ͬ��������֡��޷����б��룬������eclips����ʾ���� ��
	}
