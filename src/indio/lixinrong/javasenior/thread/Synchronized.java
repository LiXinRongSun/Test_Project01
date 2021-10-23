package indio.lixinrong.javasenior.thread;
/**
 * 关于锁的面试题（3）
 * 需要等待的情况  类锁
 *t1 和 t2  是两个 静态方法，用 synchronized  修饰后成了类锁；
 虽然t1 t2  用两个对象  但是  一个拿走 类锁时另一个还是需要等待·
 *
 *
 */
public class Synchronized implements Runnable  {
    // obj  是静态 变量
    private static  Object obj;
    //线程  t1 的 obj  在方法区
    //线程  t2 的 obj   覆盖了方法区里的 obj1 变成了obj2
    //  所以  t1  和  t2  共享了obj2 对象；

        public static Object getObj() {
        return obj;
    }
    public static void setObj(Object obj) {
        Synchronized.obj = obj;
    }
    public  Synchronized(Object obj) {
        this.obj = obj;
    }
    //静态方法1
    public  synchronized static void t1() {
        System.out.println("开始方法一");
         try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println( Thread.currentThread().getName()+"完成了方法一");   
    }
    //静态方法2
    public synchronized static void t2() {
        System.out.println("开始了方法二");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"完成了方法二");
       
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
    if(Thread.currentThread().getName().equals("t1")){
        this.t1();
    
        
    

        }
        //Java 代码自上而下逐行执行 所以if条件 是为了 t2 不用执行 方法一
    if(Thread.currentThread().getName().equals("t2")){
        this.t2();
       }
    }
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();
        
        Thread t1 = new Thread(new Synchronized(obj));
        Thread t2 = new Thread(new Synchronized(obj2));
       
        t1.setName("t1");
        t2.setName("t2");
        
        t1.start(); 
        t2.start(); 
    }
    
}
