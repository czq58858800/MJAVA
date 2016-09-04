import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by zqchen on 16/8/29.
 */
public class BlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new ArrayBlockingQueue(1024);

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        new Thread(producer).start();
        new Thread(consumer).start();
        Thread.sleep(2000);
        String name = new Thread(producer).getName();
        System.out.println(name);
        new Thread(producer).wait(20000);
        new Thread(consumer).checkAccess();

    }

}
