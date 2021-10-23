package indio.lixinrong.javasenior.set;

import javax.lang.model.util.ElementScanner6;

public class Students implements Comparable<Students>{
    private  String name;
    private int  cla;
    private int    age;
    private int score;
    public Students(){
    }
    public Students(int cla, String name,int age,int score){
        this.cla = cla;
        this.name = name;
        this.age = age;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Students [age=" + age + ", cla=" + cla + ", name=" + name + ", score=" + score + "]";
    }
    //重写 compareTo 内部比较器
    @Override
    public int compareTo(Students stu) {
        // TODO Auto-generated method stub
        if(this.age -stu.age>0){
            return 1;
        }else if(this.age-stu.age<0)
        {return -1;
        }else if(this.name.compareTo(stu.name)>0){
            return 1;
        }else if (this.name.compareTo(stu.name)<0){
            return -1;
        }else{
            return this.score - stu.score;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCla() {
        return cla;
    }

    public void setCla(int cla) {
        this.cla = cla;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //重写hashcode 方法
    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        int result = this.name.hashCode();
        result +=this.age;
        result +=this.cla;
        result +=this.score; 
        return result;
    }
    //重写equals 方法；
    @Override
    public boolean equals(Object object){
        if(object == null){
            return false;
        }else if(object == this){
            return true;
        }else if(object instanceof Students){
            Students students = (Students) object;
            if(students.age == this.age&&students.name.equals(this.name)&&students.cla==this.cla&&students.score==this.score)
            return true;
    
        }
        return false;
    }
}