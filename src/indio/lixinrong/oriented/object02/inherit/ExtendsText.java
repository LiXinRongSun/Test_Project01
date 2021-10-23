package indio.lixinrong.oriented.object02.inherit;
/**
 * 这是一个关于封装类的测试
 * 向上转型时：将子类类型赋值给父类，该引用不可以调用父类没有的属性和方法
 *  调运的方法的是子类的重写的方法；
 * 向下转型时：将父类引用转换为子类引用
 */
public class ExtendsText {
    public static void main(String[] args) {
        Students students = new Students("李三",20,"男",80);
    //     System.out.println(students.getA());
    // students.getA();
        students.study();
        students.eat();
        System.out.println(students.toString());
        Person person =new Students();//这里创建的引用是一个父类引用
        System.out.println(person);


        person.eat();
        System.out.println(person.toString());
        Students students2 =(Students)person;
        // students2.getA();
        //Students students3 =(Students)new Person();
        //虽然可以编译通过但会出现转换异常 ClassCastException 异常；
        Students students4 =(Students)students2;
        System.out.println(students2==students4);//转换后的引用是同一个引用；
        students2.stuid = 100;
       // students3.age = 20;
        
    }
    
}