package indio.lixinrong.oriented.object04.facbasics03;

import java.util.Arrays;

public class SelsctionStrategy implements Istrategy {
 @Override
 public void algorithm(int[] arr){
     System.out.println("------数组遍历之前-----");
     System.out.println(Arrays.toString(arr));
     int temp;
     for(int i=0; i<arr.length-1 ;i++){
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]>arr[j]){
                 temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = temp;
             }
         }
      }

   System.out.println(Arrays.toString(arr));

 }   
}