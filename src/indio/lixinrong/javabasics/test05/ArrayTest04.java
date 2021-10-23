package indio.lixinrong.javabasics.test05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest04 {
    public static void main(String[] args){

    Scanner sc =new Scanner(System.in);
    int a=sc.nextInt();
    int sum=a;
    int[] arr= new int[a];
    for(int i=0;i<a;i++){
    arr[i]=sc.nextInt();
    

    }
    int b=sc.nextInt();

    for(int i=0; i<a;i++){
      if(b==arr[i]){
          int f;
    for(f=i;f<a-1;f++){
        arr[f]=arr[f+1];
    }
    arr[a-1]=0;
    i--;
    a--;
    
    
    }
    
      }
      System.out.println("删除后的数组");
for(int i : arr){
System.out.println(i);




} 
System.out.println(Arrays.toString(arr));   
    


    }
    
}