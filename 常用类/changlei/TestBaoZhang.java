package java2.lzx.changlei;

public class TestBaoZhang {
	public static void main(String[] args) {
		Integer i1=new Integer(1);
		Integer i2=new Integer("1");
		Integer i3=4;//自动装箱；
		int ii=i3;//自动拆箱；
		System.out.println(ii);
		//Integer i3=new Integer("d231");
		//String s=i3.toString();
		//System.out.println(s);
		String s=i2.toString();
		System.out.println(s);
		//只能含有数字的字符串才能转换；
System.out.println("**************************分割**********************");		
		int a1=i1.intValue();//integer和int的转换；
		double a2=i1.doubleValue();
		float a3=i1.floatValue();
		byte a4=i1.byteValue();
		short a5=i1.shortValue();
		long a6=i1.longValue();
		//char a7=i1.charValue();没有这个方法；
		String st;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(i1.toString());
		System.out.println(i2.intValue());
		//System.out.println(i3.toString());
System.out.println("**************************分割**********************");
		System.out.println(i1.compareTo(i2));
		//在数字上对比两个Integer对象，相同为0，不同为1；
		int m=new Integer("123456").intValue();
		System.out.println(m);
		int n=Integer.parseInt("123456",8);//根据8进制转换；
		System.out.println(n);//String转换为int
		String s1;
		s1=Integer.toString(513);
		System.out.println(s1);//将int转换为String;
		System.out.println("**************************分割**********************");
		//Character
		Character ac=new Character('a');
		System.out.println(Character.isUpperCase(ac));
		//确定指定的字符是否为大写；
		System.out.println(Character.isLowerCase(ac));
		//确定指定的字符是否为小写；
		System.out.println(Character.isDigit(ac));
		//指定字符是否为数字；
		
		
		
		
	}

}
