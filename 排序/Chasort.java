package sort;
/*��������
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
	        int get=a[i+1];//getΪҪ���������ֱ�Ӹ�ֵ���������±긳ֵ��Ϊ�˺�������ʱ��ʹa[]�ĸ���Ԫ�ص�ֵ���ơ�
	      j=i;
	      while(j>=0 && a[j]>get){//�õ�Ҫ�����λ�ã�
	        a[j+1]=a[j];//����Ԫ�أ�
	        j--;
	      }
	      a[j+1]=get;//���룻
	    }
	  }
	}
