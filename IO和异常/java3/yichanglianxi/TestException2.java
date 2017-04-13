package java3.yichanglianxi;
import java.util.Scanner;
public class TestException2 {
	public static void main(String[] args) throws Exception {
		TestException2 te2=new TestException2();
		double[] d=new double[2];
		Scanner in=new Scanner(System.in);
		d[0]=in.nextDouble();
		d[1]=in.nextDouble();
		
			System.out.println(te2.def(d));
		
			
	
		
	}
	public double def(double[] a) throws Exception{
		if(a.length>2 || a.length<2){
			throw new IndexOutOfBoundsException();
		}else if(a[1]==0){
			throw new ArithmeticException();
		}else if(a[0]<0 || a[1]<0){
			throw new FuException("不能有负数");
		}
		return a[0]/a[1];
	}

}
class FuException extends Exception{
	public FuException(){
		
	}
	public FuException(String s){
		super(s);
	}
}