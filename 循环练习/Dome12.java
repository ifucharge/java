/*循环结构练习21；用户登入验证；
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
      System.out.println("请输入用户名：");
      name=in.next();
      System.out.println("请输入密码：");
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
      System.out.println("登入系统");
      return true;
    }else System.out.println("sorry"+(3-s));
    return false;
  }

}
