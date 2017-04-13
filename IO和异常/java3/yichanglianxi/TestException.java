package java3.yichanglianxi;

import java.util.Random;
/*孙悟空吃桃子
 * */
public class TestException {
	public static void main(String[] args) {
		TestException te=new TestException();
		int s=0;
		int peach;
		while(s<=100){
			peach=new Random().nextInt()%7;
			try{
				s+=te.sun(peach);
			}catch(NullPointerException e){
				System.out.println("王母：泼猴");
			}catch(ArithmeticException e){
				System.out.println("王母：你这猴头");
			}catch(Exception e){
				System.out.println("王母：我的蟠桃");
			}
			
		}
		System.out.println("老孙吃饱了");
			
		}
	
	public int sun(int t)throws Exception{
		int m=0;
		if(t==0){
			m=0;
			System.out.println("孙悟空：这桃子烂了");
			throw new Exception(); 
		}else if(t==1){
			m=1;
			System.out.println("孙悟空：桃不好吃");
			throw new NullPointerException();
		}else if(t==2){
			m=5;
			System.out.println("孙悟空：这桃子还可以");
			throw new ArithmeticException();
		}else System.out.println("孙悟空：这桃子太好吃咯");
		m=10;
		return m;
	}
	}


