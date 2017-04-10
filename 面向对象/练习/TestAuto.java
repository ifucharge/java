package com.lzx.op.lianxi;
/*多态：计算车辆总租金练习：
 * */
public class TestAuto {
	public static void main(String[] args) {
		C c=new C();
		Auto[] a1={new Scar("GL8",4),new Scar("550i",4),new Scar("550i",4),new Bus("金杯",34)};
		System.out.println("总租金："+c.showCalc(a1,5));
	}
	

}
abstract class Auto{
	private String model;
	private int seat;
	public Auto(){
		
	}
	public Auto(String model,int seat){
		this.model=model;
		this.seat=seat;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	
	public abstract int calc(int day);
	
}

class Scar extends Auto{
	public Scar(){
		
	}
	public Scar(String model,int seat){
		super(model,seat);
	}
	public int calc(int day){
		if(this.getModel().equals("GL8")){
			return 600*day;
		}else if(this.getModel().equals("550i")){
			return 500*day;
		}else return 300*day;
	}
}
class Bus extends Auto{
	public Bus(){
		
	}
	public Bus(String model,int seat){
		super(model,seat);
	}
	public int calc(int day){
		if(this.getSeat()<=16)
			return 800*day;
		else return 1500*day;
	}
}

class C{
	public int showCalc(Auto[] au,int day){
		int s=0;
		for(int i=0;i<au.length;i++){
			s+=au[i].calc(day);
		}
		return s;
	}
}

