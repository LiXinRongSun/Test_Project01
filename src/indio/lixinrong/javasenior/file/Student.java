package indio.lixinrong.javasenior.file;

import java.io.Serializable;

public class Student implements Serializable {
     String name ;
     int   age ;
     public Student(){

     }
     public Student(String name, int age) {
         this.name = name;
         this.age = age;
     }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    
}
