public class Demo2{

}
class Person{
  private String name;
  private int age;
  private String school;
  private String major;
  public Person(){

  }
  public Person(String name){
    this.name=name;

  }
  public Person(String name,int age){
    this(name);
    this.age=age;

  }
  public Person(String name,String school){
    this(name);
    this.school=school;
    }
    public Person(String name,int age,String major){
      this(name,age);
      this.major=major;
    }

}
