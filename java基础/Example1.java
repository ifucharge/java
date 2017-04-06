/*格式化输出
%s   --->格式化字符串
%d   --->格式化数字(十进制)
%f   ---->格式化小数
%c   ---->格式化字符
%b   ---->格式布尔类型
%%    ---->输出百分号(%)
*/
public class Example1{
  public static void main(String[] args){
    String s1="s1s1";
    String s2="s2s2";
    String s3="abcd";
    int i1=5;
    int i2=55;
    double d1=4;
    double d2=-3.141592653;
    System.out.printf("%d,%d,%f",2,3,3.0);
    System.out.printf("\r\n第一个数：%d,第二个数：%f,第三个字符：%S",i1,d1,s3);
    //多个字符或数字拼接时，按前面的各种格式在后面依次填写相应格式变量；
    //当%S s大写时输出的字符串也是大写的,当然该字符串只能含有字母；
    System.out.printf("\nPI:%+-10.2f",d2);
    //m.n%f:表示整数部分为m位的数值，当d2的整数部分没有m位时从左到右用空格位填充。
    //+-m.n%f表示：+m.n%f：输出带有正负号的小数；
    //-m.n%f:输出的小数左对齐；-与m对应，没有m时-也没必要；
    //+-m.n%f:输出的小数既有正负号又是左对齐；
    //小数部分四舍五入的保留n位小数。
    System.out.printf("\r\n百分数：%d%%",i2);
    //输出百分数 %%就输出%；
  }
}
