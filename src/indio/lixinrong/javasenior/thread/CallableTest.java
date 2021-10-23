package indio.lixinrong.javasenior.thread;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableTest implements  Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        // TODO Auto-generated method stub
        Thread.sleep(5000);

        return  new Random().nextInt(10);
    }
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Callable<Integer> call = new CallableTest();
        FutureTask<Integer> task = new FutureTask<Integer>(call);
        Thread thread = new  Thread(task);

        thread.start();

        System.out.println(task.isDone());
        
        System.out.println(task.get());
        System.out.println(task.isDone());
    }
    
}
