package com.lzx.biji;
/*用Runnable接口实现多线程；
 * 优点：避免java单一继承所带来的局限性；
 *可以实现数据共享
 * */
public class TestRunnable {
	public static void main(String[] args) {
		MyRun mr=new MyRun();
		Thread th=new Thread(mr);
		th.start();
		new Thread(mr).start();
		
	}
	

}

class MyRun implements Runnable{
	private int s=10;//用作共享的数据：

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			s--;
			
			System.out.println(Thread.currentThread().getName()+"test:"+i+"s:"+s);
		}
		
	}
	
}
