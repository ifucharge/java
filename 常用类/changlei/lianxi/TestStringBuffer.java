package java2.lzx.changlei.lianxi;

public class TestStringBuffer {
	public static void main(String[] args) {
		String a="abcbas23112";
		TestStringBuffer tsb=new TestStringBuffer();
		System.out.println(tsb.duiCheng(a));
		System.out.println(tsb.duiCheng2(a));
		System.out.println(tsb.dx(a));
		
	}
	
	
	//String方法判断对称字符串；
	public boolean duiCheng(String a){
		int s=0;
		for(int i=0;i<a.length()/2;i++){
			if(a.charAt(i)==a.charAt(a.length()-i-1)){
				s++;

		}
	}System.out.println(s);
		if(s==a.length()/2){
		return true;
	}else return false;

}
	//StringBuffer方法判断对称字符串；/
	public boolean duiCheng2(String a){
		StringBuffer sb=new StringBuffer(a);
		if(sb.reverse().toString().equals(a)){//注意：reverse方法返回的是StringBuffer类型
			                                  //要转换为String才能用equals比较字面值；
			return true;
		}else return false;
	}
	//倒叙输出偶位数的字符串
	public String dx(String a){
		String s="";
		for(int i=1;i<a.length();i+=2){
			s=s+a.charAt(i);
		}
		StringBuffer sb=new StringBuffer(s);
		return sb.reverse().toString();
	}
	
}