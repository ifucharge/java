package com.lzx.collectionlianxi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.*;


public class GoShop {
	public static void main(String[] args) throws IOException {
		Go gg=new Go();
		gg.init();
		System.out.println(gg.us.getCo());
		gg.save(gg);
		gg.load();
	}

	

}
class Go implements Serializable{
	User1 us=new User1();
	Scanner in=new Scanner(System.in);
	
	public void init(){
		String op="y";
		us.setCo(new ArrayList());
		System.out.println("user:");
		us.setUsername(in.next());
	while(op.equals("y")){
			
			//dd.setSp(sp);
			System.out.println("no:");
			int n=in.nextInt();
			System.out.println("type：");
			String t=in.next();
			System.out.println("price:");
			double d=in.nextDouble();
			System.out.println("ss:");
			int ss=in.nextInt();
			us.getCo().add(new ShangPing(n,t,d,ss));
			System.out.println("y/n");
			op=in.next();
			}
	}
	public void save(Object obj) throws IOException{
		OutputStream os=new FileOutputStream("d:/hhhh/save.bin");
		ObjectOutputStream oos=new ObjectOutputStream(os);
		oos.writeObject(obj);
		oos.flush();
		oos.close();
		os.close();
	}
	public void load() throws IOException{
		InputStream is=new FileInputStream("d:/hhhh/save.bin");
		ObjectInputStream ois=new ObjectInputStream(is);
		User1 dd=null;
		
		int i=0;
		double s=0;
		try {
			 dd=(User1)ois.readObject();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("产品名     单价      数量");
		Iterator it=dd.getCo().iterator();
		while(it.hasNext()){
			
			ShangPing sp=(ShangPing)it.next();
			System.out.println(sp.getType()+"    "+sp.getPrice()+"    "+sp.getSs());
			s+=sp.getSs();
		}
	
		System.out.println("总价："+s);
		
	}

}
class User1 implements Serializable{
	private String username;
	Collection<ShangPing> co;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Collection getCo() {
		return co;
	}
	public void setCo(Collection co) {
		this.co = co;
	}
	
	
}

 class ShangPing implements Serializable{
	 private int no;
	 private String type;
	 private double price;
	 private int ss;
	 public ShangPing(){
		
	}
	public ShangPing(int no,String type,double price,int ss){
		this.no=no;
		this.type=type;
		this.price=price;
		this.ss=ss;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getSs() {
		return ss;
	}
	public void setSs(int ss) {
		this.ss = ss;
	}
	@Override
	public String toString() {
		return "ShangPing [no=" + no + ", type=" + type + ", price=" + price + ", ss=" + ss + "]";
	}
	

}
