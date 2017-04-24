/*条件结构练习10，录入会员信息和幸运会员。
*/

import java.util.Scanner;
public class Dome3{
  public static void main(String[] args){
    int number;
    String brthday;
    int score;
    int i;
    Scanner in=new Scanner(System.in);
    Dome3_1 d3=new Dome3_1();


    for(i=0;i<3;i++){
      System.out.println("亲输入会员号");
      number=in.nextInt();
      System.out.println("亲输入生日");
      brthday=in.next();
      System.out.println("亲输入积分");
      score=in.nextInt();

    if(1<=number/1000 && number/1000<=10){
      System.out.println("已录入会员信息。");
      System.out.println(number+"\t"+brthday+"\t"+"score");
      d3.draw(number);
      break;
    }else
    {
      System.out.println("录入失败,重新录入！");
    }
  }
  if(i==3){
  System.out.println("sorry");
}

  }
}
