package indio.lixinrong.javabasics.test05;
/**
 * 需求：创建引用类型数组，存储元素；
 * 
 * 
 * 字符串数组
 * 
 */
public class ArrayTest02 {
   public static void main (final String[] args) {
       final Student[] stu = new Student[5];
       final Student stu1 = new Student("小李", 18, '女');
       final Student stu2 = new Student("小赵", 13, '男');
       final Student stu3 = new Student("小周", 17, '女');
       final Student stu4 = new Student("小明", 48, '男');
       final Student stu5 = new Student("小王", 58, '男');
       stu[0] = stu1;
       stu[1] = stu2;
       stu[2] = stu3;
       stu[3] = stu4;
       stu[4] = stu5;
       for(Student s : stu){
        System.out.println(s);
       }


       int[] a ={1,2,3};

       for(int i : a){
        System.out.println(i);
       }

   }

}

class Student {
   String name;
   int age;
   char gender;

   public Student() {

   }

   public Student(final String name, final int age, final char gender) {
     this.name =name;
     this.age =age;
     this.gender= gender;
 }
 @Override
 public String toString() {
     return "Student [age=" + age + ", gender=" + gender + ", name=" + name + "]";
 }





}   
    
