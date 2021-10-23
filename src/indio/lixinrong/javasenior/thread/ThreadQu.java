package indio.lixinrong.javasenior.thread;

public class ThreadQu extends Thread {
    Act    mAct;
    public ThreadQu(Act mAct) {
        this.mAct = mAct;

    }
    @Override
    public void run() {
        mAct.qu(5000);
        System.out.println("线程"+Thread.currentThread().getName()+"余额"+mAct.getValue());

    }    
}
