/*ѭ���ṹ��ϰ18���������㡣
 * */

import java.util.Scanner;
public class Dome9{
  public static void main(String[] args){
    int no;
    int num;
    double sum=0;
    double me;
    String op;
    Scanner in=new Scanner(System.in);
    do{
    System.out.println("�������ţ�");
    no=in.nextInt();
    System.out.println("������������");
    num=in.nextInt();
    switch(no){
      case 1:
      sum+=245*num;
      System.out.println("�ƽ�ս��"+"������"+num+"�ϼƣ�"+sum);
      break;
      case 2:
      sum+=570*num;
      System.out.println("����"+"������"+num+"�ϼƣ�"+sum);
      break;
      case 3:
      sum+=800*num;
      System.out.println("����֮��"+"������"+num+"�ϼƣ�"+sum);
      break;
      default:
    	  break;

    }
    System.out.println("�Ƿ����y/n��");
    op=in.next();

  }while(op.equals("y"));
    System.out.println("�ۿ�8�ۣ���");
    System.out.println("Ӧ����"+discount(sum));
    System.out.println("ʵ����");
    me=in.nextDouble();
    System.out.println("���㣺"+zhao(me,sum));



}
  public static double discount(double sum){
	  sum=sum*0.8;
	  return sum;
  }
  public static double zhao(double me,double sum){
	 me=me-discount(sum);
	  return me;
  }


}
