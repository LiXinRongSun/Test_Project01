package indio.lixinrong.javabasics.test05;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * 这是一个数组的拷贝方法
 * 
 * 引用System类中的 static void arraycopy方法
 */
public class ArrayTest03 {

    public static void main (String[] args){
    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    String[] name =new String[a];
    for(int i=0;i<a;i++){
    name[i]=sc.next();

     }
     System.out.println(Arrays.toString(name));
     String[] nameBak =new String[a];
     System.arraycopy(name, 0, nameBak, 0, name.length);
     for(String i:nameBak){
         System.out.println(i);
     }

    
        






    }
}