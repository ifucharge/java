public class  Demo3{
  public static void main(String[] args){
    char[] a={'a','c','u','b','e','p','f','z'};
    Demo3 deo=new Demo3();
    deo.sort(a);
    System.out.println("升序输出为：");
    for(int i=0;i<a.length;i++){
      System.out.print(" "+a[i]);
    }
    System.out.println("\n逆序输出为：");
    for(int i=a.length-1;i>=0;i--){
      System.out.print(" "+a[i]);
    }
  }
  public void sort(char[] a){
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length-1;j++){
        if(a[i]>a[j]){
          exchange(a,i,j);
        }
      }
    }
  }
  public void exchange(char[] a,int i,int j){
    char t;
    t=a[i];
    a[i]=a[j];
    a[j]=t;
  }
}
