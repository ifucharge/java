package java2.lzx.changlei;
import java.util.Arrays;
/*String类：
 * 1.例如字符串"abv"也是String对象,1.String s="abv"；这个对象"abv"存在常量池中；
 *   而 2.String s=new String("abv");就有两个对象，一个是new出来堆空间的对象，存有指向"abv"的
 *   地址值。
 *   
 *   
 * */
public class TestString{
	public static void main(String[] args) {
		//String s;
		//System.out.println(s);
		/*String s="hello";
		s+=" world";
		System.out.println(s);*/
		//String类的构造方法；
		int a=55;
		char[] ca={'a','c','v','f'};
		double d=3.123214;
		
		String str1="hello";
		String str2="world";
		String str3="helloworld";
		String str4="abc";
		String str5="AbC";
		String str6=null;
		String str8;
		String str7="";
		String str9="  h e l l o  ";
		StringBuilder st=new StringBuilder();
		st.append(str1).append(str2);
		System.out.println(st);
		byte[] by={98,99,100,101,102};
		char[] c={'a','b','c','d','e'};
		//Byte[] by={1,3,5,7,9};？？？		
		String s1=new String(by);//字节数组转换为字符串；
		System.out.println(s1);
		s1=new String(by,0,4);//截取字节数组长度转化为字符串，0：开始的位置，4：长度；
		System.out.println(s1);//
		s1=new String(c);//把字符数组转换为字符串；
		System.out.println(s1);
		System.out.println(str3==(str1+str2));
		//false,变量拼接是先在常量池创建空间，再拼接；
		System.out.println(str3=="hello"+"world");
		//true，常量拼接是先拼接(编译时会优化成"helloworld")再在常量池中找相同字符串，有就共用，无则创建；
		System.out.println("******************分割*********************");	
		//String的方法;
		//1.判断方法：
		System.out.println(str1.equals(str2));
		System.out.println(str4.equalsIgnoreCase(str5));
		//true,不区分大小写，比较字符串；
		System.out.println(str3.endsWith(str2));//true
		System.out.println(str3.endsWith("d"));
		//true，查看str3是否已str2结束的；
		System.out.println(str3.startsWith(str1));//true,是否以str1开头；
		System.out.println(str3.contains(str1));//true,str3中是否包含str1;
		//System.out.println(str8.isEmpty());str8未初始化；
		System.out.println("str7:"+str7.isEmpty());//true
		//System.out.println(str6.isEmpty());//空指针异常；
		//String str=null,是有了字符串对象，但是是空对象；这个对象里没有地址值；
		//String str; 没有对象没初始化；无法调用方法；
		//String str="";有对象，有地址值，地址指向空的字符串。
		System.out.println("******************分割*********************");
		//2.获取方法：
		System.out.println(str3.length());//str3的长度；
		System.out.println(str3.charAt(1));//获得指定索引位置的字符；
		System.out.println("tetsset"+str3.indexOf('l'));//返回指定字符在此字符串中第一次出现处的索引
		System.out.println(str3.indexOf("wo",8));//返回指定字符在此字符串中该索引后第一次出现处的索引
		System.out.println(str3.indexOf(str1));//返回指定字符串在此字符串中第一次出现处的索引。
		System.out.println("test"+str3.substring(1));
		System.out.println(str3.substring(1, 3));
		//截取字符串索引为4之后的字符串和索引为1到3的字符串（有1无3）；
		System.out.println("******************分割*********************");
		//3.转换功能
		System.out.println(str3.toUpperCase());
		//把字符串转换为大写形式
		System.out.println(str3.toUpperCase().toLowerCase());
		//转换为小写；
		//获取字符数组
		System.out.println(Arrays.toString(str3.toCharArray()));
		//把字符串转换为字节数组：
		System.out.println(Arrays.toString(str3.getBytes()));
		//就是把单个字符串中单个字符转换为各个asc2码形成的数组；
		//把各种类型数据转化为字符串,valueOf()是静态方法；
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(c));
		System.out.println(String.valueOf(a));
		//拼接字符串：
		System.out.println(str3.concat("OK!!"));
		System.out.println("******************分割*********************");
		//4.其他方法：
		//1替换功能：
		System.out.println(str3.replace("hello","fuck" ));
		//字符串替换；
		System.out.println(str3.replace('l', 'U'));
		//单个字符替换；
		//System.out.println(str3.replaceAll("hello", "dsad"));
		System.out.println(str9.trim()+"123");
		//2去掉字符串首尾的空格；
		System.out.println(str9.replace(" ", "")+"123");
		//去掉字符串所有的空格
		//3按字典顺序比较俩字符串；
		System.out.println("b".compareTo("z"));
		//返回int值，单个字符的话返回b的asc2码-a的asc2码;
		System.out.println("am".compareTo("amjadsdsa"));
		//如果前一个字符相同就比较后一个字符，直到对应不同就返回这两个不通值得差;
		//如果是包含关系就返回这两个字符串的字符相差多少个；
		
		
		

		
	
		
	}
}