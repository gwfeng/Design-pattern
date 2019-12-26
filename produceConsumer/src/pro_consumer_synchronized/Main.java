package pro_consumer_synchronized;

/**
 * @author feng
 * @date:2019/12/26
 * @description  生成 消费者
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
