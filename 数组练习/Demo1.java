package lianxi;

import java.util.Scanner;
public class Demo1{
  public static void main(String[] args){
    //int[][] f=new int[1][1];
  //int []f[]=new int[3][];
  //float []f[]=new float[6][6];//ûë��;
  //int[] a=new int[3];
    double[] money=new double[5];
    Demo1 doe=new Demo1();
    Scanner in=new Scanner(System.in);
    for(int i=0;i<money.length;i++){
      System.out.println("�������"+(i+1)+"�ʹ�����");
      money[i]=in.nextDouble();

    }
    System.out.println("���"+"\t\t"+"���");
      for(int i=0;i<money.length;i++){
        System.out.println(i+"\t\t"+money[i]);

      }
      System.out.println("�ܽ�"+doe.sum(money));



  }
  public double sum(double[] a){
    double s=0;
    for(int i=0;i<a.length;i++){
      s+=a[i];
    }
    return s;

  }
}
