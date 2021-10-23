package indio.lixinrong.oriented.object04.facbasics02;

public class PersonFactory {
 public  static Person getInstance(String type){
    if("Student".equals(type)){
        return new Student("张三",19,200.0);
        
    } 
    else{
    return null;}

 }   
}