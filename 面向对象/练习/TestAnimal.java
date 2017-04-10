package com.lzx.op.lianxi;
public class TestAnimal{
	public static void main(String[] args) {
		Animal a1=new Tiger("老虎","黄色的");
		Animal a2=new Shark("鲨鱼","黑色的");
		a1.eat();
		a2.eat();
		/*Animal a=new Tiger("小老虎","huang");
		a.eat();
		a=new Shark("小鲨鱼","黑色的");
		a.eat();*/
		Syy s=new Syy();
		s.feed(a1);
		s.feed(a2);
		
		
		
	}
	
}
 class Animal {
	private String aname;
	private String color;
	public Animal(){
		
	}
	public Animal(String aname,String color){
		this.aname=aname;
		this.color=color;
	}
	
	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show(){
		System.out.println("anmae:"+this.aname+"color:"+this.color);
	}
	public void eat(){
		
	}

}



class Tiger extends Animal{
	//public Tiger(){
		
	//}
	public Tiger(String aname,String color){
		super(aname,color);
	}
	
	public void eat(){
		System.out.println(this.getColor()+this.getAname()+"在吃肉");
	}
}

class Shark extends Animal{
	public Shark(){
		
	}
	public Shark(String aname,String color){
		super(aname,color);
	}
	public void eat(){
		System.out.println(this.getColor()+this.getAname()+"在吃鱼");
	}


}
class Syy{
	
	public void feed(Animal a){
		System.out.println("饲养员喂食给"+a.getColor()+a.getAname());
		a.eat();
	}
}
