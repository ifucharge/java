/*由*组成的菱形；
*/


public class Xunhuan2{
	  public static void main(String[] args){
	    for(int i=0;i<4;i++){
	      System.out.println();
	      for(int j=3;j>=i;j--){
	    	  System.out.print(" ");
	      }
	      for(int j=1;j<=2*(i+1)-1;j++){
	        System.out.print("*");
	      }
	    }
	    for(int i=1;i<=3;i++){
	    	System.out.println();
	    	for(int j=0;j<=i;j++){
	    		System.out.print(" ");
	    	}
	    	for(int j=5;j>=2*i-1;j--){
	    		System.out.print("*");
	    	}
	    }
	  }
	}
