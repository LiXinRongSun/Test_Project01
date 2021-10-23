package indio.lixinrong.javabasics.test04;

public class LoopTest {
    public static void main(String[] args) {
       long time = System.nanoTime();
        for(int i=1;i<20;i++){
            for(int j=1; j<(100-5*i)/3 ; j++ )
              {  
               
                if(i+j+(100-(5*i+3*j))*3==100 ){
                    System.out.println(i+","+j+","+((100-(5*i+3*j))*3));
                    }
              }

        }
        long time1 =System.nanoTime();
        long time2 =System.nanoTime();
        System.out.println(time1-time);
        for(int i = 1;i<=20;i++){
            for(int j = 1; j<=33 ; j++){
              
                if(15*i+9*j+(100-i-j)==300&&i+j+(100-i-j)==100&&i>0&&j>0&&(100-i-j)>0){
                  System.out.println("公鸡："+ i + "母鸡:" + j + "小鸡:"+(100-i-j));
                } 
            }
          }
        long time3 =System.nanoTime();
        System.out.println(time3-time2);
        for(int i=1;i<=10;i++){
          for(int j=10-i;j>0;j--){
            System.out.print(" ");
          }
          for(int k=2*i-1;k>0;k--){
            System.out.print("*");
          }
          System.out.println();
        }
        for(int i=0;i<9;i++){
          for(int j=0;j<=i;j++){
           System.out.print(" ");
          }
          for(int k=0;k<2*(9-i)-1;k++){
            System.out.print("*");

          }
          System.out.println();
        }
         }
}