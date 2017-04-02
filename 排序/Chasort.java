package sort;
/*插入排序；
 * */
public class Chasort{
	  public static void main(String[] args){
	    int[] a={3,5,4,1,6,8,9,55};
	    Chasort ch=new Chasort();
	    ch.sort(a);
	    for(int i=0;i<a.length;i++){
	      System.out.println(a[i]);
	    }


	  }
	  public void sort(int[] a){
	    int j;
	      for(int i=0;i<a.length-1;i++){
	        int get=a[i+1];//get为要插入的数，直接赋值，而不用下标赋值是为了后面排序时会使a[]的各个元素的值后移。
	      j=i;
	      while(j>=0 && a[j]>get){//得到要插入的位置；
	        a[j+1]=a[j];//后移元素；
	        j--;
	      }
	      a[j+1]=get;//插入；
	    }
	  }
	}
