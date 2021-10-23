package indio.lixinrong.javasenior.toolclass.testlist;

import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * LinkeList 是一个 双向链表 ，在加入元素时不需要元素位置改变指针域指向；
 */

public class TestLInkedList {
    public static void main(String[] args) {
        int _a =2;
        char  z= '1';
        int a;
        
        System.out.println();
        String s=10+20+"30";
        String s1 ="30"+10+20;
        System.out.printf("%s %s",s,s1);
        
        
        List<Integer> list = new  LinkedList<Integer>();
        list.add(80);
        
        list.add(80);
        list.add(78);
        //list.add("ee");前面规定集合的数据类型是Integer；
        list.add(0,45);
        list.add(2,34);

        System.out.println(list);
        System.out.println(list.remove(0));//删除指定索引的元素并返回被删除元素的值
        System.out.println(list.isEmpty());//判断集合中元素为空但引用并不为空;yingy
        System.out.println(list != null);//判断引用是否为空；
        System.out.println(list);
        System.out.println(list.get(0));
        
        System.out.println();
        

        // Java中栈和队列的实现类
        /**
         * 栈的实现可以用  LinkedList类
         * 队列的实现 Queue  LinkedList类实现了Queue 接口
         * 双端队列 deque    
         */
        Deque<String> deque1 = new LinkedList<String>();//
        Queue<String> queue = new LinkedList<String>();//队列
        
        
        deque1.push("果盘1");
        deque1.push("果盘2");
        deque1.push("果盘3");
        
    
        queue.add("果盘1");
        queue.add("果盘2");
        queue.add("果盘3");


        System.out.println(deque1.getFirst());
        System.out.println(deque1.getClass());
        System.out.println(deque1);
        System.out.println(deque1.size());
        System.out.println(deque1.peek());//获取栈顶的元素
        while(!deque1.isEmpty()){
            System.out.println(deque1.pop());//返回栈顶元素并删除；
        }
        System.out.println(deque1.size());
        
        System.out.println(queue.size());
        System.out.println(queue.poll());//获取并移除此队列的头

        System.out.println(queue.peek());//
        //System.out.println(queue.remove("果盘3"));
        System.out.println(queue.getClass());
        System.out.println();
        
        
    }
    
}
