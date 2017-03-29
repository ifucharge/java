/**
条件结构练习13，商品换购。
@author lzx
@version 2.0
@param args


 */

import java.util.Scanner;

public class Dome6 {
	public static void main(String[] args) {
		double qian;
		int times;
		Grade grade1 = new Grade();
		Scanner in = new Scanner(System.in);
		System.out.println("请输入金额：");
		qian = in.nextDouble();
		System.out.println("是否参加兑换活动："+"\n"+"1:满50 元，加两元换购百事可乐一瓶。"+"\n"
				                              +"2:满100元，加3元换购500ml百事可乐一瓶。"+"\n"

+"3:满100元，加10元换五斤面粉。"+"\n"
+"4:满200元，加10元换购一个苏泊尔锅哦。"+"\n"
+"5:满200元，加20元换购欧莱雅爽肤水一瓶。"+"\n"
+"0:不换购。"+"\n"
+"请选择："
				);


		times = in.nextInt();
		grade1.fil(qian,times);

	}

}

class Grade {
	int j;

	public void grade(double qian, int i) {
		switch (i) {
		case 1:
			j = 2;
			System.out.println("本次消费金额：" + (qian + j));
			break;
		case 2:
			j = 3;
			System.out.println("本次消费金额：" + (qian + j));
			break;
		case 3:
			j = 10;
			System.out.println("本次消费金额：" + (qian + j));
			break;
		case 4:
			j = 10;
			System.out.println("本次消费金额：" + (qian + j));
			break;
		case 5:
			j = 20;
			System.out.println("本次消费金额：" + (qian + j));
			break;
		default:
			System.out.println("本次消费金额：" + qian);
			break;
		}
	}
	public void fil(double qian,int times){
		if (times > amount(qian)) {
			System.out.println("sorry，无法选择。");
		} else
			grade(qian, times);

	}
	public int amount(double qian) {
		int i;
		if (qian < 50) {
			i = 0;
		} else if (qian >= 50 && qian < 100) {
			i =1;
		} else if (qian >= 100 && qian < 200) {
			i = 3;
		} else
			i = 5;
		return i;
	}


}
