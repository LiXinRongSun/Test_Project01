package indio.lixinrong.oriented.object04.facbasics02;

public abstract class Person {
 String name;
 int age;
 /*这是一个无参构造方法 */
 public Person(){

 }   
 public Person(String name, int age ){
     this.name = name;
     this.age = age;


 }
 public abstract void eat();

 @Override
 public String toString() {
     return "Person [age=" + age + ", name=" + name + "]";
 }
 
}
 