
/*δ��װ��java����������;
 * */
import java.util.Scanner;
public class Calc1{
  public static void main(String[] args){
    int a;
    int b;
    int s;
    String exit="n";
    Calc c=new Calc();
    Scanner in=new Scanner(System.in);
    while(exit.endsWith("n") ){
    System.out.println("��������Ҫ���������");
    a=in.nextInt();
    b=in.nextInt();
    System.out.println("������1/2/3/4");
    System.out.println("1:add****2:subtract****3:multiply****4:divide");
    s=in.nextInt();
    c.option(s,a,b);
    System.out.println("�Ƿ��˳�y/n");
    exit=in.next();
    }
  }
}
class Calc{
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
  System.out.println("��������");
  }
  public void option(int a,double x,double y){//�������ó����Ľ����ȷ��
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
