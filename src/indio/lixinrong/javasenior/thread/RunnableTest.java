package indio.lixinrong.javasenior.thread;

public class RunnableTest {
    public static void main(String[] args) {
        Runnable   runnable = new Runnable(){

            @Override
            public void run() {
                
                // TODO Auto-generated method stub
            while (true) {
               System.out.println("乌龟在跑"+Thread.currentThread().getName());

            }}

        };
        new Thread(runnable).start();
        new Thread(runnable).start();
    }
    
}
