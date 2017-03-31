/*Ñ­»·½á¹¹Á·Ï°16£¬FooBizBaz¡£
*/

public class Dome7{
  public static void main(String[] args){
    FooBizBaz foo=new FooBizBaz();
    foo.fooBizBaz();
  }

}
class FooBizBaz{
  public  void fooBizBaz(){
    for(int i=1;i<=150;i++)
    {
      if(i%3==0 && i%5==0 && i%7==0){
        System.out.println(i+"FooBizBaz");
      }else if(i%3==0 && i%5==0){

        System.out.println(i+"FooBiz");
      }else if(i%7==0 && i%3==0){
        System.out.println(i+"FooBaz");
      }else
      if(i%5==0 && i%7==0){
        System.out.println(i+"BizBaz");
      }else if(i%3==0){
        System.out.println(i+"Foo");
      }else if(i%5==0){
        System.out.println(i+"Biz");
      }else if(i%7==0){
        System.out.println(i+"Baz");
      }

    }
  }

}
