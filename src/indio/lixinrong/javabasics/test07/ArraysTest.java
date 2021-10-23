package indio.lixinrong.javabasics.test07;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        Object[] a1={1001,"张三丰",19,"讲师"};
        Object[] a2={1002,"张翠山",20,"助教"};
        Object[] a3={1003,"张无忌",21,"主任"};
        Object[][] emps= new Object[3][];
        emps[0]=a1;
        emps[1]=a2;
        emps[2]=a3;
        System.out.println(Arrays.toString(emps[0]));
        System.out.println(emps[0][0]);
    }
    
}