package indio.lixinrong.oriented.object04.facbasics02;

public class TestFactory {
 public static void main(String[] args) {
     Person person = PersonFactory.getInstance("Student");
     person.eat();
     System.out.println(person);
 }   
}
