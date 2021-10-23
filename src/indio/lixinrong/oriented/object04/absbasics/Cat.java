package indio.lixinrong.oriented.object04.absbasics;

public class Cat extends Animal {
 String color;
 public Cat(){

 } 
 public Cat(String name,int age, String color){
     super(name,age);
     this.color = color;


 }
 @Override
 public  void shout(){
     System.out.println("Cat------喵喵的叫");

 }
}
