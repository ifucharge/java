package java2.lzx.changlei;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestData {
	public static void main(String[] args) {
		TestData das=new TestData();
		Date da=new Date();//util包
		SimpleDateFormat sdf =new SimpleDateFormat();
		String st=sdf.format(da);
		System.out.println(st);//简化的时间格式,将date类型变成Stirng类型
		//按要求格式化：
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf1.format(da));
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println(sdf2.format(da));
		/*SimpleDateFormat sdf3=new SimpleDateFormat("yyyy-MM-dd");
		String st2="2001-11-11";
		Date da2=sdf3.parse(st2);
		System.out.println(da2);*///???没有用，字符串转换为date类型
		
		
		System.out.println(da);
		das.test();
	}
	@Deprecated//过时的方法；
	public void test(){
		System.out.println("这个方法以过时");
	}

}
