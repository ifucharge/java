package lianxi;

import java.util.Scanner;
public class Demo1{
  public static void main(String[] args){
    //int[][] f=new int[1][1];
  //int []f[]=new int[3][];
  //float []f[]=new float[6][6];//没毛病;
  //int[] a=new int[3];
    double[] money=new double[5];
    Demo1 doe=new Demo1();
    Scanner in=new Scanner(System.in);
    for(int i=0;i<money.length;i++){
      System.out.println("请输入第"+(i+1)+"笔购物金额");
      money[i]=in.nextDouble();

    }
    System.out.println("序号"+"\t\t"+"金额");
      for(int i=0;i<money.length;i++){
        System.out.println(i+"\t\t"+money[i]);

      }
      System.out.println("总金额："+doe.sum(money));



  }
  public double sum(double[] a){
    double s=0;
    for(int i=0;i<a.length;i++){
      s+=a[i];
    }
    return s;

  }
}
