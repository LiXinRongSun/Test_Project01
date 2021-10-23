package indio.lixinrong.javabasics.test03;
import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        
    
    Scanner updata= new Scanner(System.in);
    int score =updata.nextInt();
    String type= score<60 ? "不及格":"及格";
    int flag =score>60?1:(score==60?0:-1);
    System.out.println("type="+type);
    System.out.println("flag="+flag);
    }
    
}