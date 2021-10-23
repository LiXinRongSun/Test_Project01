package indio.lixinrong.javabasics.test08;

import java.util.Scanner;

/**
 * 递归放法求n的阶乘
 */
public class Recursion {
    public static void main(final String[] args) {
        int sum=0;

        final Scanner sc =new Scanner(System.in);
        final int a=sc.nextInt();
       final long startTime =System.nanoTime();
        System.out.println(arr01(a));
       final long endTime =System.nanoTime();
       System.out.println("程序运行时间"+(endTime-startTime)+"ns");
       final long startTime01=System.nanoTime();
       System.out.println(arr02(a));
       final long endTime02=System.nanoTime();
       System.out.println("程序运行时间"+(endTime02-startTime01)+"ns");
       System.out.println(arr03(a));
      // System.out.println(arr04(0,1,a));
     
       //斐波那契数列求和
       final int[] fib =new int[a];

       for(int i=1;i<=a;i++){
       sum=sum+arr(i);
       }
    }
    public static int arr(final int n){
        
        if(n==0||n==1){

            return 1;
        }       
        if(n>=2){

            return n*arr(n-1);
        }
        else{
            return 0;
        }
        
    
    }
    public static int arr01(final int n){
       int result=1;
       for(int i=0;i<=n;i++){
            if(i==1||i==0){
                result=1;}
            if(i>=2){
                result=result*i;
            }
            
        }
        return result;


    }
    public static int arr02(final int n){
        int result=1;
        int i=1;
        while(i<=n){
            result= result*i;
            i++;

        }
        
        
        return result;

    }  
    public static int arr03(final int n) {
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        if(n>2){
            return arr03(n-1)+arr03(n-2);
        }
        else{
            return 0;
        }
        
    }  
    /*利用尾递归方法求斐波那契数列 */
    public static int arr04(final int first,final int second,final int n){
        //first 当前数列第一项的值
        if(n==1){
            return first;
        }
        //second 当前数列第二项的值
        if(n==2){
           return second;
        }
        if(n==3){
            return first+second;
        } 
        if(n>3){
            //递归调用
            return arr04(second,first+second, n-1);
        }
        else {
            return 0;
    
        }
    }
    public static void arr05(final int a){

    }
}

class FibArrays {
    public static void main(final String[] args) {

        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        System.out.println(fibArrays(n));
        
    }
    /*
    *递归记忆化
    *利用数组存储斐波那契数列已经被求过的值
    */
    public static int fibArrays(final int n) {
        final int[] arr = new int[n + 1];

        if (arr[n] != 0 || n == 1) {
            return arr[n];

        }
        if (n == 2) {
            return arr[n] = 1;

        } else {
            return arr[n] = fibArrays(n - 1) + fibArrays(n - 2);
        }

    }
    /*
     * 尾递归求N的阶乘
     * 递归调用同时释放上一个栈，等执行到尾部时直接输出；
     */
    public static int arr(int n,int a){
        if(n==1||n==0){
            return 1;
        }
        else
        return  arr(n-1,n*a);

    }

}