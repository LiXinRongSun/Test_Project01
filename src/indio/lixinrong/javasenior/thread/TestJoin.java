package indio.lixinrong.javasenior.thread;

public class TestJoin {
    public static void main(String[] args) {
        int i = 0;
        //while (i <= 200) {
            //if(i==20){
        Thread thread = new TortiseThread();
             thread.setName("程咬金");
             thread.setDaemon(true);
             thread.start();
          /*   try {
                thread.join();//打断其他线程该线程执行完之后在执行其他线程；
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }*/


            //}
            while(i<=200){
            System.out.println("兔子领先，add oil"+i+" "+Thread.currentThread().getName()+" "+
            Thread.currentThread().getPriority());
            i++;
        }
    }
    
}
