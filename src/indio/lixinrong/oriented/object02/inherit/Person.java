package indio.lixinrong.oriented.object02.inherit;

public class Person {
        private int a;
        String name;
        int age;
        String gender;
    public Person (){

        }
    public Person (String name, int age, String gender) {
         this.name = name;
        this.age = age;
        this.gender = gender;
    }
        
    public void eat(){
        System.out.println("-----吃饭的方法-------");

    }
    public void sleep(){
        System.out.println("------睡觉的方法--------");
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", gender=" + gender + ", name=" + name + "]";
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
        
    }