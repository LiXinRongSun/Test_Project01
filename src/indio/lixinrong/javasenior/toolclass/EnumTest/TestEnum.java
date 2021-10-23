package indio.lixinrong.javasenior.toolclass.EnumTest;

import java.util.Random;


public class TestEnum {
    public static void main(String[] args) {
        for(Season k: Season.values()){
            System.out.println(k);
        }
        String b = String.valueOf(331);
        //System.out.println( Season.valueOf("SPRING"));
        
        int a =new Random().nextInt(4);
        System.out.println(String.valueOf(Season.values()[a]));
        switch(Season.values()[a]){
            case SPRING :
               System.out.println("春天");
               break;
            case SUMMER :
               System.out.println("夏天");
               break;
            case AUTUMN :
               System.out.println("秋天");
               break;
            case WINDTER :
              System.out.println("冬天");
              break;

        }
        }
    
}
enum Season{
    SPRING,SUMMER,AUTUMN,WINDTER
}
