package com.lzx.lianxi;

public class GouPiao {
	public static void main(String[] args) {
		Gou g1=new Gou();
		Gou g2=new Gou();
		Gou g3=new Gou();
		g1.setName("窗口1");
		g2.setName("窗口2");
		g3.setName("窗口3");
		g1.start();
		g2.start();
		g3.start();
		
		
	}

}

class Gou extends Thread{
	public static int s=100;
	
		public void run(){
			while(s>0){
		/*		synchronized ("lock") {
					s--;
					if(s>=0){
					System.out.println(getName()+" 余票:"+s);
				}
			}
				*/
				m1(s);
		
			
			}
		}
		
	/*	public void m1(int s){
			synchronized("lock"){				
       				  s--;
					   if(s>=0){
						   System.out.println(getName()+" 余票："+s);
					   }				
				 
			}		
		}一个方法如果一开始就synchronized，可以把synchronized写在方法上*/	
		public static synchronized void m1(int s){
			s--;
			 if(s>=0){
				   System.out.println(Thread.currentThread().getName()+" 余票："+s);
			   }
		}
}