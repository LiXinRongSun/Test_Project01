package indio.lixinrong.javasenior.stacktest;

import java.util.Stack;

public class StackTest {
     public static void main(String[] args) {
        //实例化两个栈对象 
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        //向栈顶方向添加元素
        stack.push(12);
        stack.push(14);
        stack.add(13);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.get(0));//根据索引查找元素
        System.out.println(stack.pop());
        System.out.println(stack.search(12));//根据元素返回元素位置从1开始；


     }
    
}
