package indio.lixinrong.javasenior.thread;
/**
 * 关于死锁的经典面试题
 * 两个线程 分别共享 两个对象  两个线程完成任务需要拿到两把锁（两把锁嵌套）
 * 当两个线程分别拿走一把锁 ，两个线程都完成不了共享对象锁里的任务线程进入死锁；
 * 线程1 在完成线程时拿走了对象一的锁，再要完成里面嵌套任务是需要对象二的锁 而
 * 对象二的锁被 线程2拿走而线程而需要完成对象二锁里嵌套的任务时需要对象一的锁；
 * 线程进入死锁
 * 死锁  锁的嵌套；
 */
public class Deadlock implements Runnable  {
    private Object obj;
    private Object obj2;
    public Deadlock(Object obj, Object obj2){
        this.obj = obj;
        this.obj2 = obj2;
    }
     @Override
    public void run() {
        // TODO Auto-generated method stub
       if(Thread.currentThread().getName().equals("t1")){
       synchronized(obj){
           try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("t1拿到了obj的锁");
           synchronized(obj2){

           }
        }
       }
       //当线程名等于t2 时   进入此方法
       if(Thread.currentThread().getName().equals("t2")){
       // 线程t2  拿到obj2 的锁  然后线程进入休眠一秒状态    
       synchronized(obj2){
           try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("t2拿到了obj2的锁");
          synchronized(obj){

          }
       }
       }
    }
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();
        Thread t2 = new Thread(new Deadlock(obj, obj2));
        Thread t1 = new Thread(new Deadlock(obj, obj2));
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
        

    }

   
    
}

