/*�����ṹ��ϰ10��¼���Ա��Ϣ�����˻�Ա��
*/

import java.util.Scanner;
public class Dome3{
  public static void main(String[] args){
    int number;
    String brthday;
    int score;
    int i;
    Scanner in=new Scanner(System.in);
    Dome3_1 d3=new Dome3_1();


    for(i=0;i<3;i++){
      System.out.println("�������Ա��");
      number=in.nextInt();
      System.out.println("����������");
      brthday=in.next();
      System.out.println("���������");
      score=in.nextInt();

    if(1<=number/1000 && number/1000<=10){
      System.out.println("��¼���Ա��Ϣ��");
      System.out.println(number+"\t"+brthday+"\t"+"score");
      d3.draw(number);
      break;
    }else
    {
      System.out.println("¼��ʧ��,����¼�룡");
    }
  }
  if(i==3){
  System.out.println("sorry");
}

  }
}
