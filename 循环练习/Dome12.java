/*ѭ���ṹ��ϰ21���û�������֤��
 * */
import java.util.Scanner;
public class Dome12{
  public static void main(String[] args){
	  String name;
	  String psw;
	  int s=0;
    Dome12 doe = new Dome12();
    Scanner in=new Scanner(System.in);


    for(int i=0;i<3;i++){
      System.out.println("�������û�����");
      name=in.next();
      System.out.println("���������룺");
      psw=in.next();
      if(doe.login(name,psw,s)){
      break;
      }
      s++;
    }
    if(s==3)
    {System.out.println("ssossorry!!!");}
  }

  public boolean login(String name,String psw,int s){
    if(name.equals("asd") && psw.equals("123456")){
      System.out.println("����ϵͳ");
      return true;
    }else System.out.println("sorry"+(3-s));
    return false;
  }

}
