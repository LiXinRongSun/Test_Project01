package indio.lixinrong.javabasics.test04;

import java.util.Scanner;

/**
 * 这是一个关于Switch循环的小程序
 * 
 */
public class SwitchTest {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  month=sc.nextInt();
        switch(month){
            
            case 1:
            case 2:
            case 3:
            System.out.println("春季"); //break;//如果不用break，程序运行过程中会从第一个满足的入口一直运行到有break的地方结束

            case 4:
            case 5:
            case 6:
            System.out.println("夏季");break;

            case 7:
            case 8:
            case 9:
            System.out.println("秋季");break;
            case 10:
            case 11:
            case 12:
            System.out.println("冬季"); break;
            default:
            System.out.println("输入月份错误1");break;
        
        }
        
    }
   
    
}