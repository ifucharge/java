import java.util.Scanner;
public class Demo4{
  public static void main(String[] args){
    int[] money=new int[4];
    Scanner in=new Scanner(System.in);
    Demo4 deo=new Demo4();
    System.out.println("����۸�");
    for(int i=0;i<money.length;i++){
      System.out.println("��"+(i+1)+"�ҵ���ֻ��۸�:");
      money[i]=in.nextInt();
    }

    System.out.println("��ͼ۸�"+deo.min(money));


  }
  public int min(int[] a){
    int min=0;
    for(int i=0;i<a.length;i++){
      if(a[min]>a[i]){
        min=i;
      }
    }
    return a[min];

  }
}
