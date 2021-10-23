package indio.lixinrong.javasenior.thread;

public class Testo2 implements Runnable {
    public static void main(String[] args) {
        Runnable  run = new Runnable(){

            @Override
            public void run() {
                while (true) {
                    System.out.println("乌龟在跑"+Thread.currentThread().getName());
                }}

        };
        Thread thread = new Thread(run);
        thread.start();
        Thread thread2 = new Thread( new Testo2() );
    }   

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println("123e");
        
    }
    
}
