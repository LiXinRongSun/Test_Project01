package indio.lixinrong.javasenior.map;

import java.security.Key;

public class Student implements Comparable<Student> {
    private Integer id;
    private String  name;
    private String  gender;
    private  int     age;
    public Student(){
    }
    public Student(Integer id, String name, int age,String gender){
       this.id =id;
       this.name = name;
       this.age = age;
       this.gender = gender;
    }

    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", gender=" + gender + ", id=" + id + ", name=" + name + "]";
    }
  
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return o.id-this.id;
    }
    
    
}