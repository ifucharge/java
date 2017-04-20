package com.lzx;
import java.util.*;
import java.io.*;
/*登录和注册（序列化加Map集合改）
 * */
public class DengluDemo2{
	Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		File file=new File("d:/新建文件夹/新建文本文档.txt");
		DengluDemo2 dd=new DengluDemo2();
		User2 u=new User2();
		if(file.exists()){
			try {
				dd.op((User2)dd.load(file.getAbsolutePath()));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else 
			dd.op(u);
		
		
	}
	public Map<String,String> getMap(){
		Map<String,String> mm=new HashMap<>();
		return mm;
	}
	public void zc(User2 u){
		
		Map<String,String> mm=u.init();
		System.out.println("id:");
		String s1=in.next();
		System.out.println("psw:");
		String s2=in.next();
		if(mm.size()==0){
			mm.put(s1, s2);
		}
		
		else if(panDuan(u,s1)){
			mm.put(s1,s2);
		}else
			{System.out.println("注册失败");}
		System.out.println(mm);
	}
	public boolean dl(User2 u ){
		
		Map<String,String> mm=u.init();
		Set<Map.Entry<String, String>> ss=mm.entrySet();
		System.out.println(mm);
		System.out.println("id:");
		String s1=in.next();
		System.out.println("psw:");
		String s2=in.next();
		for(Map.Entry<String,String> k:ss){
			
			if((k.getKey().equals(s1) && k.getValue().equals(s2))){
				System.out.println("成了");
								
				return true;//return 退出方法；
			}
		}
		System.out.println("登录失败");	
		return false;
	}
	public boolean panDuan(User2 u,String s1){
		Map<String,String> mm=u.init();
		Set<String> ss=mm.keySet();
		for(String s:ss){
			if(!(s1.equals(s))){
				return true;
			}
		}
		return false;
		
	}
	public void op(User2 u){
		getMap();
		
		boolean op=true;
		while(op){
		System.out.println("A/B");
		
		String op1;
		op1=in.next();
		if(op1.equalsIgnoreCase("a")){
			
			zc(u);
		}else if(op1.equalsIgnoreCase("b")){
			
			if(dl(u)){
				
				break;
			}
		}else 
			System.out.println("false!!");
		System.out.println("y/n");
		if(in.next().equalsIgnoreCase("n")){
			try {
				save(u);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			op=false;			
		}
		
	}
	in.close();
	}
	public void save(Object obj) throws IOException{
		OutputStream os=new FileOutputStream("d:/新建文件夹/新建文本文档.txt");
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(obj);
	}
	public Object load(String s) throws IOException, ClassNotFoundException{
		InputStream is=new FileInputStream(s);
		ObjectInputStream ois=new ObjectInputStream(is);
		return ois.readObject();
	}
}
class User2 implements Serializable{
	private Map<String,String> mm=new HashMap<String,String>();;
	public Map<String,String> init(){
		
		return mm;
	}
}
