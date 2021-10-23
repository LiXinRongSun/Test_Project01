package indio.lixinrong.javasenior.thread;
/**
 * 关于锁的面试题（3）
 * 需要等待的情况  类锁
 * obj 是静态的  Synchronized  的 Object  存在方法区里
 *线程一和线程2 还是共享了它 这里还是共享了对象
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
    @Override
    public void run() {
        // TODO Auto-generated method stub
    if(Thread.currentThread().getName().equals("t1")){
    synchronized (obj){ //这里用this 表示这个线程
        try {
            Thread.sleep(1000*2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(Synchronized.getObj());
        System.out.println( Thread.currentThread().getName()+"完成了方法一");
    }

        }
        //Java 代码自上而下逐行执行 所以if条件 是为了 t2 不用执行 方法一
        if(Thread.currentThread().getName().equals("t2")){
        synchronized(obj){
            System.out.println(Synchronized.getObj());
        System.out.println(Thread.currentThread().getName()+"完成了方法二");
        }}
    }
    public static void main(String[] args) {
        Object obj = new Object();
        Object obj2 = new Object();
        Synchronized s = new Synchronized(obj);
        Thread t1 = new Thread(new Synchronized(obj));
        Thread t2 = new Thread(new Synchronized(obj2));
        System.out.println(Synchronized.getObj());
        t1.setName("t1");
        t2.setName("t2");
        System.out.println(obj);
        System.out.println(obj2);
         
        t1.start(); 
        t2.start(); 
    }
    
}
