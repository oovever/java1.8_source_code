package lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created this one by oovever on 2022/9/22.
 */
public class TestLock {

    private static int num=30;
    public static void main(String[] args) {


        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(new Runnable() {
            @Override public void run() {
                System.out.println("test");
            }
        });
        ReentrantLock lock = new ReentrantLock();
        new Thread(() -> {
            try {
                lock.lock();
                while (num > 0) {
                    num--;
                    System.out.println(Thread.currentThread() + "-" + num);
                }
            }finally {
                lock.unlock();
            }

        }).start();

        new Thread(() -> {
            try {
                lock.lock();
                while (num > 0) {
                    num--;
                    System.out.println(Thread.currentThread() + "-" + num);
                }
            }finally {
                lock.unlock();
            }
        }).start();


    }
}
