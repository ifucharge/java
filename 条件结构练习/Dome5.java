/*
 * �����ṹ��ϰ11�ۿ�*/
import java.util.Scanner;
public class Dome5{
	public static void main(String[] args){
   double qian;
   //boolean vip;
   String a;
  double finqian;
  Scanner in=new Scanner(System.in);
  System.out.println("�������Ƿ��ǻ�Ա��");
  a=in.next();
  System.out.println("�������");
  qian=in.nextDouble();

  Discount discount1=new Discount();
  finqian=discount1.discount(qian,discount1.viper(a));
    System.out.println("ʵ��֧����"+finqian);}
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
//���Ľ����жϻ�Ա��
