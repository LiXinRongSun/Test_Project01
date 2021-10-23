package indio.lixinrong.oriented.object04.absbasics;

public abstract class Animal {
  String name;
  int age;
  public Animal(){


  }
  public Animal(String name,int age){
      this.name = name;
      this.age = age;

  }
  public abstract void shout();
  public void eat(){

  }
  

  public static void main(String[] args) {
      
  }
    
}