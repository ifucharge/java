/*for循环练习；
 * 由"*"组成的金字塔倒影
 * */
public class Xunhuan{
	public static void main(String[] args){
	for(int i=9;i>0;i--){
		System.out.println();
		for(int k=0;k<i;k++){
			System.out.print(" ");
		}

		for(int j=0;j<9-i+1;j++){
			//System.out.print(" ");
			System.out.print(" *");
		}
	}
	for(int i=0;i<8;i++){
		System.out.print("\n  ");
		for(int k=0;k<i+1;k++){
			System.out.print(" ");
		}
		for(int j=0;j<8-i;j++){
			System.out.print("* ");
		}
	}	
	}
	}
