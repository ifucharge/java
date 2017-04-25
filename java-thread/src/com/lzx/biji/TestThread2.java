package com.lzx.biji;

public class TestThread2 {
	public static void main(String[] args) throws InterruptedException {
	/*	Thread2 th1=new Thread2();
		Thread2 th2=new Thread2();
		th1.setDaemon(true);
		//th2.setDaemon(true);
		setDaemon设置守护线程，当最后的线程都为守护线程时程序停止运行；
		 * 比如这个程序，当th1是最后执行时就只有一个结果，不是最后执行时就有两个；
		 * 
		th2.start();
		th1.sleep(100);
		
		th1.start();*/
		
		Thread3 th1=new Thread3();
		Thread3 th2=new Thread3();
		
		/*th1.start();
		th1.join();
		//th1.join(),调用了join只有th1线程执行完毕才会继续下面的代码（线程）；
		th2.start();*/
		th1.start();
		th2.start();
	
	}


}

class Thread2 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName()+"这个线程执行了");
	}
}


class Thread3 extends Thread{
	public void run(){

		for(int i=0;i<10;i++){
			System.out.println(getName()+" test:"+i);
		}
	
	}
}
