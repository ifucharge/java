package java3;

public class TestException {
	public static void main(String[] args) {
		int i1=10;
		int i2=0;
//try{}catch(){}	    
		int[] a=new int[4];
		try{
			
			a[4]=0;
		/*注意：
			  A:try里面的代码越少越好，码越少后面抓取的异常越少；
			  B:catch里面必须有内容，哪怕是给出一个简单的提示*/
			 

		}
		catch(IndexOutOfBoundsException e){
			//e.printStackTrace();
			//输出异常提示;这里其实是在try中的异常出现时，就会将异常的对象赋值给e;
			System.out.println(e.getMessage());
			//异常的消息字符串；
			System.out.println(e.toString());
			System.out.println("数组下标越界 ");			
		}
		finally{
			System.out.println("end");
		}
//---------------------------------------------------------------------------------------		
//try{}catch(){}catch(){}
/*		try{
			 a[4]=0;
//由于这个异常先出现，后面有没有对应的catch抓取，程序中断了
		}catch(ArithmeticException e){
			System.out.println("数学异常");
		}
		finally {
			System.out.println("end1");
		}
		System.out.println("到不了这里");*/
//-------------------------------------------------------------------------------------
	/*	try{
			i1=i1/i2;
			 a[4]=0;
			 
		}catch(Exception e){//一个catch只能抓取一个异常，先出现，先抓取；
			e.printStackTrace();
			System.out.println("未知异常");
		}
		finally {
			System.out.println("end1");
		}
		System.out.println("到不了这里");*/
System.out.println("-------------------------------------------------------------");
	/*	try{			
			 a[4]=0;
			 i1=10/0;
			 System.out.println("不会指行了");
	 //异常不缺定时就用多个catch，异常大小从小到大；在try大括号里面，代码出现异常，剩余的代码不执行了；
			 			 
		}catch(IndexOutOfBoundsException e){
			e.printStackTrace();
			System.out.println("数组下标越界");
		}
		catch(Exception e){
			System.out.println("未知异常");			
		}
		finally {
			System.out.println("end1");
		}									
	}
*/
try{			
	 a[4]=0;
	 i1=10/0;
	 System.out.println("不会指行了");

	 			 
}catch(IndexOutOfBoundsException | ArithmeticException e){
	e.printStackTrace();

	System.out.println("数组下标越界");
}//jdk1.7后可以将同级异常用|连起来；简化了代码

finally {
	System.out.println("end1");
	//由上面的代码可知finally的代码一定会执行，除非jvm在finall之前停止运行，一般用于释放资源操作；
	//当try里的语句的异常，catch没捉到时，finally还是会执行
	//在方法里如果finally中有return的话会覆盖掉其它的return，而且会让catch抛出的异常无效
}									
}
	
	
	
	}

