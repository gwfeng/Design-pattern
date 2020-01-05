package pro_consumer_blockingqueue;

/**
 * @author feng
 * @date:2019/12/26
 * @description
 **/
public class Producer implements Runnable {

    private Storage storage;
    public  Producer(Storage storage){
        this.storage = storage;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
                storage.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
