package com.lzx.biji;
/*	sleep,yield,join的使用和区别
 * 首先：sleep，yield都是静态的方法，代表当前的线程，join不是静态的所以代表的是指定的线程；
 * sleep和join会使线程进入阻塞状态，而yield是线程进入可运行状态；
 * 所以要优先执行低级的线程还是用sleep更好；
 * 
 * */
public class TestThread3 {
	public static void main(String[] args) {
	/*	Thread5 th5=new Thread5();
		Thread4 th4=new Thread4(th5);
		th5.setName("th5");
		th4.setName("th4");
		th4.start();
		th5.start();*/
		YieldThread yt1=new YieldThread();
		YieldThread yt2=new YieldThread();
		yt1.setName("yt1");
		yt2.setName("yt2");
		yt1.start();
		yt2.start();
		//本来如果yield方法可以阻塞线程的话，那么结果应该是yt2执行完yt1才执行
		//但是结果不是这样，显然yield只是让线程回到可执行状态，yield的线程yt1，
		//在这之后还是会被线程选择程序选中。
		
		
		
	}

}
class Thread4 extends Thread{
	Thread5 th5;
	public Thread4(Thread5 th5){
		this.th5=th5;
	}
	
	public void run(){
		System.out.println(getName()+"start!!");
		try {
			th5.join();//在这里要等待th5线程结束才会继续执行下面的代码（也就是th4线程）
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		for(int i=0;i<5;i++){
			System.out.println(getName()+":"+i);
		}
		System.out.println(getName()+"end!!");
/*	try {
		join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}不能再一个线程里面等待这个线程，这样会导致这个线程无法结束*/
	}
}

class Thread5 extends Thread{
	public void run(){
		System.out.println(getName()+"start!!");
		for(int i=0;i<5;i++){
			System.out.println(getName()+":"+i);
		}
		System.out.println(getName()+"end!!");
			
	}
}


class YieldThread extends Thread{
	public void run(){
	/*	try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		for(int i=0;i<5;i++){
		if(getName().equals("yt1")){
			yield();
		}//如果是名为yt1的线程运行时就yield(),
			System.out.println(getName()+":"+i);
		}
	}
}

