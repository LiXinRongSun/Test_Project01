package indio.lixinrong.javasenior.thread;

public class ThreadTest {
    public static void main(String[] args) {
       Act  act = new Act("act-001",10000);
       Thread thread = new ThreadQu(act);
       Thread thread1 = new ThreadQu(act);
try {
    Thread.sleep(3999);
} catch (InterruptedException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
}
    thread.start();
    thread1.start();
    
    }
    
}
