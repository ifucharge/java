package com.lzx.biji;
/*多线程的实现：1，继承Thread类；
 *          2.实现runnable接口；
 *1.    线程的几种状态
线程有四种状态，任何一个线程肯定处于这四种状态中的一种：
1)    产生（New）：线程对象已经产生，但尚未被启动，所以无法执行。
如通过new产生了一个线程对象后没对它调用start()函数之前。
2)    可执行（Runnable）：每个支持多线程的系统都有一个排程器，排程器会从线程池中选择一个线程并启动它。
当一个线程处于可执行状态时，表示它可能正处于线程池中等待排排程器启动它；也可能它已正在执行。
如执行了一个线程对象的start()方法后，线程就处于可执行状态，但显而易见的是此时线程不一定正在执行中。
3)    死亡（Dead）：当一个线程正常结束，它便处于死亡状态。如一个线程的run()函数执行完毕后线程就进入死亡状态。
4)    停滞（Blocked）：当一个线程处于停滞状态时，系统排程器就会忽略它，不对它进行排程。
当处于停滞状态的线程重新回到可执行状态时，它有可能重新执行。如通过对一个线程调用wait()函数后，
线程就进入停滞状态，只有当两次对该线程调用notify或notifyAll后它才能两次回到可执行状态。
 * */
public class TestThread {
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		MyThread mt2=new MyThread();
		System.out.println(mt.getName());
		System.out.println(mt2.getName());
		mt.setName("线程0");
		//修改线程名称：
		System.out.println(mt.getName());
		//获得当前线程的名称，名称的数值是根据你实例化的先后顺序来的；
		//System.out.println(mt.isDaemon());
		System.out.println(mt.toString());
		//
		mt.start();
		//这是启动线程的语句，在执行了start方法后，shart里有调用本地方法会开启一个新的线程
		//来执行这个对象里的run方法；
		mt2.start();
		System.out.println(mt.currentThread().getName());//main;获得的是主线程的名字
		System.out.println(mt.getName());//Thread-0;获得的是mt的线程名
		/*因为currentThread方法是返回正在执行当前语句线程的对象，此时执行mt.currentThread()
		 * 的线程是main；
		 * */
		System.out.println("么么么么木");
		System.out.println("喵喵喵喵");
		for(int i=0;i<10;i++){
          System.out.println(mt.currentThread().getName()+"  test:"+i);
		
	}
		
}
	}
class MyThread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(currentThread().getName()+"  test:"+i);
			//获得执行当前方法线程的名字；
		}
	}
}
