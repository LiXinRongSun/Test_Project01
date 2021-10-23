package indio.lixinrong.oriented.object02.inherit;

public class Students extends Person {
    private int a;
    String name;//这里重新创捷的name和继承父类的name不是一个地址
    int stuid;
    public Students(){

    }
    public Students(String name, int age,String gender,int stuid){
        super(name,age,gender);
        this.stuid = stuid;

    }
    public void study(){
        System.out.println("-----学习的方法------");
        
    }
    public void eat(){
        System.out.println("------学生吃饭的方法------");
    }


    @Override
    public String toString() {
        return super.toString();//就近原则会输出 继承父类的name; 
        //return "Students ["+"name="+name+",age="+age+",gender="+gender+",stuid=" + stuid + "]";
    }
public static void main(String[] args) {
    Students students = new Students();
    students.setA(13);//子类在继承过程中可以继承父类的所有属性和方法但是不能直接引用；
    
    Students students2 = new Students("王",22,"男",80);
    
    students2.name ="100";
    System.out.println(students2);
    System.out.println(students2.name);
    System.out.println(students.getA());
    System.out.println(students.a);
}
   
    
    
}