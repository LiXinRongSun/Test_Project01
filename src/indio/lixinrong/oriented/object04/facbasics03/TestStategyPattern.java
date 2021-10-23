package indio.lixinrong.oriented.object04.facbasics03;

import java.util.Scanner;

public class TestStategyPattern {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)(Math.random()*21);
        }
        Istrategy istrategy = new SelsctionStrategy();//将选择排序的方法赋值给istrategy
        istrategy.algorithm(arr);
        Context context = new Context(istrategy);
        context.doAnything(arr);
        Fib fib = new FibArrtion();
        
        Context context2 =new Context(fib);
        
        
        System.out.println(context2.getFib());
        System.out.println(fib.fibArr(0,1,10));
        System.out.println(context2.doFib(0, 1, 10));
    }
}