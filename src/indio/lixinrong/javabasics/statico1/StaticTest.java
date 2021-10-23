package indio.lixinrong.javabasics.statico1 ;

public class StaticTest {
    public static void main(String[] args){
    User x =new User();
    x.printName();
    User.printName02();
    x.setName("李新荣");
    x.getName();




    }
}
class User{
  private int id;
  private String name;
  private static String name01;
  public void printName(){
        System.out.println(name);
        System.out.println(name01);


}
  public static void printName02(){
      System.out.println(name01);

  }
  public void setName(String N){
      name=N;
  }
  public String  getName(){
      return name;
       
  }
}