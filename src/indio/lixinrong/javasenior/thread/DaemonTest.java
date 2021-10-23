package indio.lixinrong.javasenior.thread;

import java.util.concurrent.TimeUnit;

public class DaemonTest {
    public static void main(String[] args) throws InterruptedException {
        Thread testThread = new Thread(new Daemon());
        testThread.setDaemon(true);
        testThread.start();
        System.out.println("d.isDaemon()="+testThread.isDaemon()+"。");
        TimeUnit.SECONDS.sleep(1);
    }
    
}
class DaemonSpawn implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true){
            Thread.yield();
        }
    }

}
class Daemon implements Runnable {
     private Thread[]   threads  = new Thread[10];
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for(int i = 0; i <threads.length; i++){
            threads[i] = new Thread(new DaemonSpawn()); //
            threads[i].start();
            System.out.println("DaemonSpan"+i+" started");


        }
        for(int i = 0; i < threads.length; i++){
            System.out.println("t["+i+"].isDaemon"+threads[i].isDaemon() +".");

        }
        while(true){
            Thread.yield();
        }
    }

}