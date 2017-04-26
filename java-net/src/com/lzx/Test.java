package com.lzx;



import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test implements  Runnable{
	private Socket socket = null;
	
	public Test() {
		
	}

	public Test(Socket socket) {
		this.socket = socket;
	}

	/**
	 * 多线成的任务:不断拿到socket对象，输出hello wrld给客户单
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("线程名称:"+Thread.currentThread().getName());
		try {
			OutputStream  out =  socket.getOutputStream();//服务端发数据给客户端
			//输出hello  world给客户端
			String msg = "hello world"+Math.random();
			out.write(msg.getBytes());
			System.out.println("有客户端连接..");
			out.flush();//刷新缓存
			socket. close();//关闭与客户端的连接
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("接客了...");
		ServerSocket serverSocket = new ServerSocket(8888);
		while(true){
			Thread.sleep(1000);
			//new Thread(new ServerSocketDemo2(serverSocket.accept()));
			Socket socket = serverSocket.accept();//阻塞  拿到与客户端通讯的对象
			Test d = new Test(socket);//构建对象时，传入socket对象！！
			Thread t = new Thread(d);//开启多线程
			t.start();
		}
	}

}