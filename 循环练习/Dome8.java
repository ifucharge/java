/*循环结构练习17,1-100和判断正负。
*/
import java.util.Scanner;
public class Dome8{
  public static void main(String[] args){
    int w;
    SumMd m=new SumMd();
    Scanner in=new Scanner(System.in);
    int s=0;
    int r=0;
    do{
     w=in.nextInt();
     if(w>0){
       s++;
     } else if(w<0){
       r++;
     }

   }while(w!=0);
   System.out.println("+:"+s+"-:"+r);



    System.out.println("sumw:"+m.sumw());
    System.out.println("sumd:"+m.sumd());
  }
}
class SumMd{
  public int sumw(){
    int sum=0;
    int i=0;
    while(i<100){
      for(i=0;i<=100;i+=2)
      {
        sum+=i;
      }
    }
    return sum;
  }
  public int sumd(){
    int j=0;
    int sum=0;
    do{
      for( j=0;j<=100;j+=2){
        sum+=j;
      }
    }while(j<100);
    return sum;
  }
  public int op(int a){
    if(a>0){
      return 1;
    }else if(a==0){
      return 0;
    }else return -1;

  }


}
