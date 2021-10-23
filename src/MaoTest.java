import java.util.Arrays;
import java.util.Scanner;

public class MaoTest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int[] arr = new int[a];
        for(int i=0; i<a;i++){
            arr[i] = (int)(Math.random()*50);

        }
    
        int temp;
        for(int i=0; i<arr.length-1;i++){
             int count =0;
            for(int j=0; j<arr.length-1-i;j++){
                 if(arr[j]>arr[j+1]){
                     temp = arr[j];
                     arr[j]= arr[j+1];
                     arr[j+1] = temp;
                      count ++;
                 }
                
                 }
                 if(count==0){
                     break;
            }
        }
    System.out.println(Arrays.toString(arr));
    }
    
}