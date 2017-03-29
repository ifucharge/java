/*
 * 条件结构练习11折扣*/
import java.util.Scanner;
public class Dome5{
	public static void main(String[] args){
   double qian;
   //boolean vip;
   String a;
  double finqian;
  Scanner in=new Scanner(System.in);
  System.out.println("请输入是否是会员。");
  a=in.next();
  System.out.println("请输入金额。");
  qian=in.nextDouble();

  Discount discount1=new Discount();
  finqian=discount1.discount(qian,discount1.viper(a));
    System.out.println("实际支付："+finqian);}
}
class Discount{
  public double discount(double qian,boolean vip){
    double finqian;
    if(vip==true && qian>=200)
    {
      finqian=qian*0.75;
    }else if(vip==true)
    {
      finqian=qian*0.8;
    }else if(qian>=100)
    {
    	finqian=qian*0.9;
    }
    else
    	finqian=qian;

    return finqian;
  }
  public boolean viper(String a){
    if(a.equals("y"))

    {
    	return true;
    }
    else
    	return false;


  }
}
//待改进：判断会员；
