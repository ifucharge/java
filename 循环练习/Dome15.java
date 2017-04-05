public class Dome15{
  public static void main(String[] args){
    int s=0;
    int[] a;
    int m=1;
    for(int i=1;i<=100;i++){
      if(i%7==0){
        s++;
      }
    }
    a=new int[s];
    for (int j=0;j<s;j++){
       for(int i=m;i<=100;i++){
        if(i%7==0){
          m=i+1;
          a[j]=i;
          break;
        }
      }
    }
    System.out.println(s);
    for(int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }
  }
}
//·½·¨2£º
/*	public static void main(String[] args) {
		int t;
		int[] a=new int[100];
		for(int i=1;i<=100;i++){
			if(i%7==0){
				a[i/7-1]=i;
			}
		}
		for(int i=0;i<14;i++){
			System.out.println(a[i]);
		}
	}
*/
