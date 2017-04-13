package java2.lzx.changlei;
/*1.String的对象是存储在字符串常量池中的，每一个对象都是不可变的，当用String对一个字面值修改时，每次修改都要
 * 创建新的对象在常量池中，很浪费内存，jvm会忙着进行垃圾回收，耗费jvm资源，运行大大减缓；
 * 所以就有了StringBuffer类来对一个字符串进行修改，字符串长度是动态变化的；
 * 
 * */
public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer st1=new StringBuffer();//初始容量为16；
		StringBuffer st2=new StringBuffer(2);//初始容量为2；
		StringBuffer st3=new StringBuffer("2333");//初始容量为2333的长度+16
		StringBuffer sb1=new StringBuffer("abcd");
		StringBuffer sb2=new StringBuffer("1234");
		StringBuffer sb3=new StringBuffer("123");
		int[] i1={1,2,3,4,5};
		int i2=5;
		//StringBuffer sb=new StringBuffer(6);
		String str;
		String str1="qwer";
		
		//str=sb;不能这样赋值，String和StringBuffer是两个不同的对象；
		//增加：
		char c1='s';
		char[] c2={'a','b','c','d'};
		//sb.append("12321321321");
		//System.out.println(sb.toString());
		System.out.println(sb1.append(c1));
		System.out.println(sb1.append(c2));//直接添加字符串数组
		//System.out.println(sb1.append(i1));//i2的会添加地址值
		System.out.println("test:"+sb2.append(c2,1,3));
		//截取c2拼接;
		System.out.println(sb1.append(sb2));
		System.out.println(sb1.append(str1));
		sb1.append("123123123");
		//根据jdk1.6append()可以有:
		//char char[] int double folat long boolean String StringBuffer Object;
		System.out.println("*****************************分割*******************");
		//插入：
		System.out.println(sb1.insert(1,"@@"));
		//把下标为1的字符替换为字符串；
		System.out.println(sb1.insert(0,c2,0,1));
		//插入方法和append可用的类型一样；
		//删除：
		System.out.println(sb1.deleteCharAt(1));//删除指定位置字符；
		System.out.println(sb1.delete(0, 1));//删除指定位置字符串（包0不包1）
		//反转
		System.out.println(sb3.reverse());//反转字符串；
		//截取:
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(0,1));
		//截取后返回的是字符串，原来的StringBuffer对象并不会改变；
		
		System.out.println(str1.getBytes()[1]);
		
		
		
		System.out.println(sb1.replace(0, sb1.length(), str1));
		//System.out.println(sb1.replaceChar);
		System.out.println("*****************************分割*******************");
		//1.定义：初始长度：默认的长度
		//2.首次增长长度：第一次（用append或insert）超过初始长度后的长度=初始长度*2+2；
		 //之后连续使用相同的插入方式长度和字符串长度增长一致
		//3.再次增长长度：改变插入方式(第一次append，第二次就是insert)后超过首次增长长度后的长度
		//=（首次增长长度+1）*2；这个步骤可一直循环；
		

		System.out.println(st2.capacity());
		//sb.append("122wqewqewqe");
		System.out.println(st2.length());
		st2.insert(0, "@331123123");
		st2.append("1w12321321321");
		st2.insert(0, "1");
		//sb.delete(0, 6);//删除不会改变当前数组长度；
		System.out.println(st2.length());
		
		System.out.println(st2.capacity());
		
		
		
		
		
	}
	
	
	
	
	
	

}

