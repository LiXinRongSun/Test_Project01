/*
 * @Author: your name
 * @Date: 2021-10-11 12:26:21
 * @LastEditTime: 2021-10-12 08:59:59
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: \Demo\src\Name.java
 */
import java.util.Arrays;
import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
   
    Scanner sc =  new Scanner(System.in);
    String a = sc.next();
    char b = a.charAt(0);
    int count = 0;
    char[] arr =new char[a.length()];
    for(int i=0;i<a.length();i++){
        arr[i]=a.charAt(i);
        if(arr[i]==b){
            count++;
        }
         


    }
    System.out.println(Arrays.toString(arr));
    System.out.println(count);
    System.out.println(12|7);
    System.out.println(12>15?12:7);
}

}