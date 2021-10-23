package indio.lixinrong.oriented.object02.staticbasics;
/**
 * 这是一个关于Static关键字的练习
 * Static修饰的变量是静态变量在类加载时初始化存储在方法区可以通过类直接调用
 * Static修饰的方法在类加载时已经存在所以不会出现this super 等关键字
 * 
 */
public class StaticTest {
    public static void main(String[] args) {
    Student student =new Student("张",18,"男","清华");//school被赋值为清华；4
    System.out.println(student);
    Student student2 =new Student("王",20,"女","北大");//school被赋值为北大；
    Student student3 = new Student("李",19,"男");
    System.out.println(student);
    System.out.println(student2);
    System.out.println(student3);

    }
}
class Student{
    String name;
    int age;
    String  gender;
    static String school;
    public Student(){

    }
    public Student(String name, int age ,String gender){
        this.name = name;
        this.age =age;
        this.gender =gender;
    }
    public Student(String name, int age, String gender ,String school){
        this(name,age,gender);
        this.school=school;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", gender=" + gender + ", name=" + name + ",school="+school+"]";
    }
    
}
