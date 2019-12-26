package pro_consumer_blockingqueue;

/**
 * @author feng
 * @date:2019/12/26
 * @description
 * 它是一个已经在内部实现了同步的队列，
 * 实现方式采用的是我们第2种await() / signal()方法。
 * 它可以在生成对象时指定容量大小，
 * 用于阻塞操作的是put()和take()方法。
 * put()方法：类似于我们上面的生产者线程，容量达到最大时，自动阻塞。
 * take()方法：类似于我们上面的消费者线程，容量为0时，自动阻塞。
 **/
public class Main {
    public static void main(String[] args) {
        Storage s  =new Storage();
        new Thread(new Producer(s)).start();
        new Thread(new Producer(s)).start();
        new Thread(new Producer(s)).start();
        new Thread(new Consumer(s)).start();
        new Thread(new Consumer(s)).start();
        new Thread(new Consumer(s)).start();
    }
}
