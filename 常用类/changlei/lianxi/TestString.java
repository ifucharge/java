package java2.lzx.changlei.lianxi;
import java.util.Arrays;
/*String类的各种方法组合新方法练习
 * */
import java.util.Scanner;
public class TestString {
	public static void main(String[] args) {
		UseStr us=new UseStr();
		int[] i={1,2,3,4,5};
		String a="javawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagunjava";
		String b="java";
		String str1="asd231124sdf2143";
		String str2="你好,shijie ，fedferftr54545,呜呜hello jack";
		String str3="sad,sad,dsad,wqe,trt";
		
		
		/*String s="";
		int t=1;
		char c='a';
		s=s+c;
		s=s+t;这个注意一下,上面的代码都可以,在字符串拼接时不一定都转换成字符串类型*/
		System.out.println(Arrays.toString(us.getStr11(str3)));
		System.out.println(us.exStr("aDSAsadasd"));
		System.out.println(us.exStr1("l Fating"));
		System.out.println(us.format(i));
		System.out.println(us.reStr("abcdefg"));
		System.out.println(a.indexOf(b,0));
		System.out.println(us.checkStr(a, b));
		//System.out.println(us.timesStr(a, b));
		System.out.println(us.getnumStr(str1));
		us.getStr(str2);
	} 

}

class UseStr{
	Scanner in=new Scanner(System.in);
	//将字符串中的字符化为字符串数组：
	public char[] getStr1(String a){
		char[] c=new char[a.length()];
		for(int i=0;i<a.length();i++){
			c[i]=a.charAt(i);
		}
		return c;
	}
	public char[] showStr(String a){
		return a.toCharArray();
	}
	//第一个字母大写，其他为小写
	public String exStr(String a){
		String str=a.toLowerCase();
		String str1=str.substring(1);
		char c=str.charAt(0);
		 c=(char)(c-32);
		 return String.valueOf(c)+str1;
		 		
	}
	//链式编程完成上个方法：
	public String exStr1(String a){
		return a.substring(0,1).toUpperCase().concat(a.substring(1).toLowerCase());
	}
	//输出类似于[1,2,3,4]格式的字符串
	public String format(int[] a){
		String s="[";
		for(int i=0;i<a.length-1;i++){
			s=s.concat(String.valueOf(a[i])+",");
		}
		s=s.concat(String.valueOf(a[a.length-1]))+"]";
		return s;
	}
	//字符串反转；
	public String reStr(String a){
		String s="";
		for(int i=a.length()-1;i>0;i--){
			s+=a.substring(i-1,i);
		}
		s=a.substring(a.length()-1)+s;
		return s;
	}
	//查找一个字符串在另一个字符串中出现的次数；
	public int checkStr(String a,String b){
		int s=0;
		int m=-1;
		if(a.contains(b)){
			System.out.println("this");
		do{
			
			s=a.indexOf(b,s);
			s++;
			m++;
			
		}while(s>0);
			
		}
		return m;
	}
	//
	/*public int timesStr(String a,String b){
		int s=0;
		int m=0;
		String str="a";
		if(a.contains(b)){
			do{
				m=str.indexOf(b);
				str=a.substring(m);
				s++;
			}while(str.contains(b));
		}
		return s;
	}
*/
	//在字符串中提取数字；
	public String getnumStr(String a){
		String s="";
		for(int i=0;i<a.length();i++){
			if((int)a.charAt(i)<65 || (int)a.charAt(i)>122){
				//System.out.println("getnumStr(String a)");
				s=s+a.charAt(i);
			}
		}
		return s;
	}
	//统计数字和字母的个数：
	public void getStr(String a){
		String s="";
		int sz=0;
		int yw=0;
		for(int i=0;i<a.length();i++){
			if(((int)a.charAt(i)>=48 && (int)a.charAt(i)<=57)){
				sz++;
				
			}
			if((int)a.charAt(i)>=65 && (int)a.charAt(i)<=122){
				//System.out.println("getnumStr(String a)");
				yw++;
			}
		}
		System.out.println("数字有"+sz+"个");
		System.out.println("字母有"+yw+"个");
		
	}
	//在有，相隔的字符串中提取以逗号分隔的字符串数组
	public String[] getStr11(String a){
		int index=0;
		int index1=a.indexOf(",");
		String[] st=new String[checkStr(a,",")+1];
		System.out.println("长度："+st.length);
		for(int i=0;i<st.length-1;i++){
			st[i]=a.substring(index,index1);
			index=index1+1;
			
			index1=a.indexOf(",",index);
			
			
		}
		st[st.length-1]=a.substring(index);
		return st;
	}

	
	
}
