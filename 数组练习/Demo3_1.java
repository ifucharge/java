import java.util.Arrays;
public class Demo3_1{
  public static void main(String[] args){
    char[] a={'a','c','u','b','e','p','f','z'};
    Arrays.sort(a);
    for(int i=0;i<a.length;i++){
      System.out.print(" "+a[i]);
    }

    System.out.println(Arrays.toString(a));


  }
}
