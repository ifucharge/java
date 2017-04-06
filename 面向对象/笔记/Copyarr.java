
public class Copyarr{
  private int[] a;

  public int[] copy(int i,int[] a){
    this.a=new int[i];
    for(int j=0;j<a.length;j++){
      this.a[j]=a[j];
    }
    return this.a;
  }

}
