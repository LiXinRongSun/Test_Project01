package indio.lixinrong.javasenior.queue;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class QueueTest {
      public static void main(String[] args) {
         Queue<String>  queue = new ConcurrentLinkedQueue<String>();
         queue.offer("小红");//添加一个元素返回值是一个boolean类型；
         queue.offer("小李");
         queue.offer("汤唯");
         queue.add("小豪");//添加一个元素成功返回true 不成功抛出异常；



         System.out.println(queue.size());
         System.out.println(queue.peek());//获取队列头元素不移除；

         System.out.println(queue);
         System.out.println(queue.remove());
         System.out.println(queue.poll());
         
         


      }
      
}
