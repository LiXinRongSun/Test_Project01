package indio.lixinrong.javasenior.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Threaf extends Thread {
      
   @Override
      public void run() {
          List<String> list = new ArrayList<String>();
            for(int i=0;i<2;i++){
                list.add(new Scanner(System.in).nextLine());
        /* while (true) {
          System.out.println("乌龟在跑"+"当前线程名称"+this.getName()+"当前线程的优先级别"+this.getPriority());
          }
        }   
    /*  public static void main(String[] args){
            List<String> list = new ArrayList<String>();
            for(int i=0;i<2;i++){
                list.add(new Scanner(System.in).nextLine());
            }
      }*/}}
}
 class  Test{
    public static void main(String[] args) {
        Threaf thread = new Threaf();

        thread.start();
        int i = 0;
        while (i<1000){
            System.out.println("兔子在跑当前线程名称"+Thread.currentThread().getName() +"当前线程的优先级别"+Thread.currentThread().getPriority());
            i++;
        }
    }
}