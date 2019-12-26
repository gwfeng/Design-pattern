package pro_consumer_synchronized;

/**
 * @author feng
 * @date:2019/12/26
 * @description
 **/
public class Consumer implements Runnable {

    private Storage storage;
    public Consumer(Storage storage){
        this.storage = storage;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(2000);
                storage.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
