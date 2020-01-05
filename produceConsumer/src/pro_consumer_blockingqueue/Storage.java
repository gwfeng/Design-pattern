package pro_consumer_blockingqueue;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * @author feng
 * @date:2019/12/26
 * @description 仓库
 **/
public class Storage {
    private static final int Max = 10;

    LinkedBlockingDeque<Object> blockingDeque = new LinkedBlockingDeque<>(10);

    public void produce(){
        try {
            blockingDeque.put(new Object());
            System.out.println("【生产者" + Thread.currentThread().getName()
                    + "】生产了一个产品，现库存" + blockingDeque.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void consumer(){
        try {
            blockingDeque.take();
            System.out.println("【消费者" + Thread.currentThread().getName()
                    + "】消费一个产品，现库存" + blockingDeque.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
