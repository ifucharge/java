/*条件结构练习07，比大小。
*/
import java.util.Scanner;
public class Dome{
public static void main(String[] args){
  int []num;
  int a;
  num=new int[3];

  for (int i=0;i<=2 ;i++ ) {
    Scanner in=new Scanner(System.in);
      num[i]=in.nextInt();
        System.out.println(num[i]);
  }
  if(num[0]>=num[1])
     {
       a=num[0];
       num[0]=num[1];
       num[1]=a;

     }
     else if(num[1]>=num[2])
     {
       a=num[1];
       num[1]=num[2];
       num[2]=a;
     }
     for (int i=0;i<=2 ;i++ ) {

           System.out.println(num[i]);
     }







}
}
