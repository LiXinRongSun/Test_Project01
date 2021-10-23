package indio.lixinrong.javasenior.thread;
/**
 * 关于锁的面试题（2）
 * 需要等待的情况
 *线程一 在完成 方法一时拿走了共享对象的锁；
 *线程二 在完成 方法二时需要共享对象的锁所以线程t2需要等待；
 */
public class Synchronized implements Runnable  {
    private Object obj;
    public Synchronized(Object obj) {
        this.obj = obj;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
    if(Thread.currentThread().getName().equals("t1")){
    synchronized (obj){
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println( Thread.currentThread().getName()+"完成了方法一");
    }

        }
        //Java 代码自上而下逐行执行 所以if条件 是为了 t2 不用执行 方法一
        if(Thread.currentThread().getName().equals("t2")){
        synchronized(obj){
        System.out.println(Thread.currentThread().getName()+"完成了方法二");
        }}
    }
    public static void main(String[] args) {
        Object obj = new Object();
        Thread t1 = new Thread(new Synchronized(obj));
        Thread t2 = new Thread(new Synchronized(obj));
        t1.setName("t1");
        t2.setName("t2");
        t1.setPriority(10);
        t2.start();
        t1.start();   
    }
    
}
