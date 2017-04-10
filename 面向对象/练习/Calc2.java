package com.lzx.op.lianxi;
//封装的计算器程序；
import java.util.Scanner;
public class Calc2{
  public static void main(String[] args){

    String exit="n";
    Calcs c=new Calcs();
    Scanner in=new Scanner(System.in);
    while(exit.endsWith("n") ){
    System.out.println("输入两个要运算的数：");
    c.setN(in.nextInt(),in.nextInt());
    System.out.println("请输入1/2/3/4");
    System.out.println("1:add****2:subtract****3:multiply****4:divide");
    c.setS(in.nextInt());
    c.option(c.getS(),c.getN1(),c.getN2());
    System.out.println("是否退出y/n");
    exit=in.next();
    }
    in.close();
  }

}
class Calcs{//只能运算两个数的计算器类；多个的再看了；
  private double a1;
  private double a2;
  private int s;
  public int getS(){
    return this.s;
  }
  public void setS(int s){
    this.s=s;
  }
  public double getN1(){
    return this.a1;
  }
  public double getN2(){
    return this.a2;
  }
  public void setN(double a1,double a2){
    this.a1=a1;
    this.a2=a2;
  }

  public void option(int a,int x,int y){
    if(1<=a && a<=4){
    switch(a){
      case 1:
      System.out.println(add(x,y));
      break;
      case 2:
      System.out.println(subtract(x,y));
      break;
      case 3:
      System.out.println(multiply(x,y));
      break;
      case 4:
      System.out.println(divide(x,y));
      break;
    }
  }else
  System.out.println("输入有误！");
  }
  public void option(int a,double x,double y){//重载以让除法的结果正确；
    if(1<=a && a<=4){
    switch(a){
      case 1:
      System.out.println(add(x,y));
      break;
      case 2:
      System.out.println(subtract(x,y));
      break;
      case 3:
      System.out.println(multiply(x,y));
      break;
      case 4:
      System.out.println(divide(x,y));
      break;
    }
  }
  }

  public int add(int a,int b){
    return (a+b);
  }
  public double add(double a,double b){
    return (a+b);
  }
  public int subtract(int a,int b){
    return (a-b);
  }
  public double subtract(double a,double b){
    return (a-b);
  }
  public double multiply(double a,double b){
    return a*b;
  }
  public double divide(double a,double b){
    return a/b;
  }

}
