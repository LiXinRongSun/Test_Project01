package indio.lixinrong.oriented.object04.facbasics02;

public class Student extends Person{
    double  score;
    public Student(){

    }
    public Student(String name,int age,double score){
        super(name,age);
        this.score = score;

    }
    public void eat(){
        System.out.println("sutdent类————eat方法");
    }

    @Override
    public String toString() {
        String back = super.toString();
        
        
       back= back.replace(back.charAt((back.length() - 1)), '2');

        return back + "Student [score=" + score + "]";
    }
    
}
