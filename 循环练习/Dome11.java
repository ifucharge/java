/*循环结构练习21——1，转换二进制，两种方法；
 * */
import java.util.Scanner;
public class Dome11{
  public static void main(String[] args){
    int num;
    Dome11 doe=new Dome11();
    Scanner in=new Scanner(System.in);
    num=in.nextInt();
    doe.er1(num);
    doe.er2(num);
      }
    public void er1(int a){
      int c=a;
      int b;
      int i=0;
      int[] a1=new int[8];
      do{

        b=a%2;
        a=a/2;
        a1[i]=b;
        ++i;
        //System.out.println(b);
      }while(a!=1);

        a1[i]=1;

      for(int j=7;j>=0;j--){
        System.out.print(a1[j]);


      }
      System.out.println("\n");

    }
    public void er2(int r){
  int c;
  int[] arr =new int[10];
  double d=Math.sqrt(r);

  for(int i=0;i<=(int)d;i++){
    c=r%2;
    r=r/2;
    arr[i]=c;

  }
  for(int j=arr.length-1;j>=0;j--)
    System.out.print(arr[j]);

}

    }
