package java3;
/*throws和throw的区别
 throws
  用在方法声明后面，跟的是异常类名
  可以跟多个异常类名，用逗号隔开
  表示抛出异常，由该方法的调用者来处理
  throws表示出现异常的一种可能性，并不一定会发生这些异常
 throw
  用在方法体内，跟的是异常对象名
  只能抛出一个异常对象名
  表示抛出异常，由方法体内的语句处理
  throw则是抛出了异常，执行throw则一定抛出了某种异常

 * */
public class TestExpection2 {
	public static void main(String[] args) throws Exception{
		TestExpection2 te2=new TestExpection2();
		te2.m1();
		te2.m3();
		//te2.m4();
//测试自定义异常类：
		try{
			te2.m5(1);
		}catch(MyException e){
			System.out.println("抓到了");
			e.printStackTrace();
		}
		
	}
    
	public void m1()throws Exception{
    //并没有异常抛出，throw才是抛出异常；
	System.out.println("test");
	}
	public void m2() throws Exception{
		m1();
	}//在方法throws的异常在其他方法调用时只能try catch或者再次throws
/*	public void m3()throws Exception{
		Exception e = null;
		throw e;//throw后接的是Exception的对象，而throws后接的只是各种异常的名字；
		
	}*/
/*	public void m4() throws Exception{
		throw new IndexOutOfBoundsException();
	}*/
	public void m3()throws Exception{
		Exception e = null;
		try{
			throw e;
		}catch(NullPointerException a){
			System.out.println("空指针");
		}
		
		
	}
	
	public boolean m5(int a)throws MyException{//配合自定义异常类的使用的方法
		if(a>0){
			throw new MyException("a>0");
		}else throw new MyException("a<=0");
	}
	
}

//自定义异常类：
class MyException extends Exception{
	public MyException(){
		
	} 
	public MyException(String mes){//传入的这个String就是输出地异常信息；
		super(mes);
	} 
	
}

