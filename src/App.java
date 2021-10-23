/*
 * @Author: your name
 * @Date: 2021-10-10 20:28:44
 * @LastEditTime: 2021-10-12 13:45:46
 * @LastEditors: your name
 * @Description: In User Settings Edit
 * @FilePath: \Demo\src\App.java
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    for(int i=0;i<10000;i++){
        if(i%7==0||i/7==0&&i>=7){
            System.out.print(i+"  ");
        }
    }  

    }
    
}
