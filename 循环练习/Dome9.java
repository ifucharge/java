/*循环结构练习18，结账找零。
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
    System.out.println("请输入编号：");
    no=in.nextInt();
    System.out.println("请输入数量：");
    num=in.nextInt();
    switch(no){
      case 1:
      sum+=245*num;
      System.out.println("黄金战甲"+"数量："+num+"合计："+sum);
      break;
      case 2:
      sum+=570*num;
      System.out.println("冰杖"+"数量："+num+"合计："+sum);
      break;
      case 3:
      sum+=800*num;
      System.out.println("死亡之弩"+"数量："+num+"合计："+sum);
      break;
      default:
    	  break;

    }
    System.out.println("是否继续y/n：");
    op=in.next();

  }while(op.equals("y"));
    System.out.println("折扣8折！！");
    System.out.println("应付金额："+discount(sum));
    System.out.println("实付金额：");
    me=in.nextDouble();
    System.out.println("找零："+zhao(me,sum));



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
