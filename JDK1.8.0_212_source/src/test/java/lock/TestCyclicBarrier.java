package lock;


import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;


public class TestCyclicBarrier {

    private static CyclicBarrier cyclicBarrier;
    public static void main(String[] args) throws InterruptedException {
        cyclicBarrier = new CyclicBarrier(2);
        for(int i=0; i<2; i++){
            new InnerThread().start();
            Thread.sleep(10000);
        }

    }

    static class InnerThread extends Thread{
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " wait for CyclicBarrier.");
                System.out.println(cyclicBarrier.await());
                System.out.println(Thread.currentThread().getName() + " continued.");
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
