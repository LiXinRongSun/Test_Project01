package indio.lixinrong.oriented.object02;

// import sun.awt.AWTAccessor.SystemColorAccessor;
/**
 * 封装方法：private 修饰的变量只能通过自己的类调用
 * 构造方法：new对象时调用构造方法初始化对象
 * get,set方法：其它类可以通过get,set方法对封装后的变量进行读和写的操作；
 * toString 方法 通过重写toString 方法直接输出对象里面变量的值；
 * 
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person =new Person("李新荣",18);

        System.out.println(person);
        Person person02=new Person();
        person02.setAge(20);
        Person01 p=new Person01();
        System.out.println(p.age);
        System.out.println(p);//直接打印输出P对象时会默认调用tostring方法；
        System.out.println(person02.getAge());
        
    }
    
}
class Person01{
    String name;
    int age;
@Override
public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
}
/*@Override
    public String toString() {
        return "Person01 [age=" + age + ", name=" + name + "]";
    }*/

}
    class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        setAge(age);
    }
  public String getName(){
      return name;


} public void setName(String name){
      this.name=name;


 }
 public int getAge(){
     return age;
 } 
 public void setAge(int age){
     
 this.age=age;

 }
 
 @Override
 public String toString() {
     return "Person [age=" + age + ", name=" + name + "]";
 }
 

}