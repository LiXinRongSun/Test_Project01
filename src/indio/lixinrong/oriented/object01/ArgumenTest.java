package indio.lixinrong.oriented.object01;

public class ArgumenTest {
    public static void main(String[] args) {
        int x=12;
        int y=21; 
        
       
        System.out.println("x="+x +" ,y="+y);
        ArgumenTest test =new ArgumenTest();
        test.cast(x, y);
        System.out.println("x="+x+",y="+y);
       ArgumenTest02 test02 =new ArgumenTest02();
       test02.cast02(test02);
       System.out.println("x="+test02.x+"y="+test02.y);
      
    }
    public void cast(int x,int y){
        int temp;
        temp=x;
        x=y;
       y=temp;
       
    }


}
class ArgumenTest02{
       int x=12;
       int y=21;
       
      
     
      public void cast02(ArgumenTest02 test){
        int temp;
        temp=test.x;
        test.x=test.y;
        test.y=temp;


       }



    }