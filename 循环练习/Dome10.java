import java.util.Scanner;
public class Dome10{
  public static void main(String[] args){

    int age;
    double ageover=0;
    double agedown=0;
    double a;
    double b;
    Scanner in=new Scanner(System.in);
    for(int i=0;i<10;i++){
      System.out.println("�������"+(i+1)+"λ�˿͵����䣺");
      age=in.nextInt();
      if(age>=30){
        ageover++;
      }else
      agedown++;
    }
     a=(ageover/(ageover+agedown))*100;
     b=(agedown/(ageover+agedown))*100;
  System.out.println("30�����ϱ�����"+a+"%");
  System.out.println("30�����±�����"+b+"%");

  }
}
