/*条件结构练习08，成绩等级。
*/

import java.util.Scanner;
public class Dome2{
  public static void main(String[] args){
    int score;
    Scanner in=new Scanner(System.in);
    score=in.nextInt();
    if(0<=score && score<=100){
      if(score>=90){
        System.out.println("A");
      }
        else{
          if(70<=score && score<90){
            System.out.println("B");
          }else if(60<=score && score<70)
          {
          System.out.println("C");
        }else
        {
          System.out.println("D");
        }
        }
      }



    else{
      System.out.println("输入有误");
    }





  }
}
