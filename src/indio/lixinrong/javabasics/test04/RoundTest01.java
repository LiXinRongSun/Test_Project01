package indio.lixinrong.javabasics.test04;

import java.util.Scanner;

public class RoundTest01 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int len =sc.nextInt();
    for(int i=1;i<=len;i++){
    for(int j=1; j<=len-i; j++){
        System.out.print(" ");
    }
    for(int k=1;k<2*i;k++){
        System.out.print("*");


    }
    System.out.println();

    }
    for(int i=1;i<len;i++){
     for(int j=1;j<=i;j++){
         System.out.print(" ");}
     for(int k=1;k<=2*(len-i)-1;k++){
         System.out.print("*");
     }



     
    System.out.println();

    }

    }
}