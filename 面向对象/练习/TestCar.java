package com.lzx.op.lianxi;
import java.util.Scanner;
public class TestCar {
	public static void main(String[] args) {
		TestCar tc=new TestCar();
		Scanner in=new Scanner(System.in);
		Car c1=new Truck("大卡车",15);
		Car c2=new MinCar("小汽车",3);
		System.out.println("请输入租赁的天数：");
		int day=in.nextInt();
		tc.showCar(c1);
		tc.showRent(c1, day);
		tc.showCar(c2);
		tc.showRent(c2, day);
		
	}
	public void showCar(Car cs){
		System.out.println(cs.toString());
	}
	public void showRent(Car cs,int day){
		System.out.println("租金为："+cs.rent(cs.getWeight(), day));
	}

}

class Car{
	private String model;
	private double weight;
	public Car(){
		
	}
	public Car(String model,double weight){
		this.model=model;
		this.weight=weight;
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String toString(){
		return "型号为："+this.model+" 重量为："+this.weight;
	}
	public double rent(double weight,int day){
		return weight*day*50;
	}
}
class Truck extends Car{
	public Truck(){
		
	}
	public Truck(String model,double weight){
		super(model,weight);
	}
	public double rent(double weight,int day){
		return weight*day*100;
	}
}
class MinCar extends Car{
public MinCar(){
		
	}
	public MinCar(String model,double weight){
		super(model,weight);
	}
	public double rent(double weight,int day){
		return weight*day*30;
	}
}

