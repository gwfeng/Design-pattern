package pro_consumer_synchronized;

import java.util.ArrayList;
import java.util.List;

/**
 * @author feng
 * @date:2019/12/26
 * @description 仓库
 **/
public class Storage {
    private static final int Max = 10;
    private static Object lock = new Object();
    List<Object> list = new ArrayList<>();

    public void produce(){
       synchronized (lock){
           //超过了就等待
           while (list.size()+1> Max){
               System.out.println("【生产者" + Thread.currentThread().getName()
                       + "】仓库已满");
               try {
                   lock.wait();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
           list.add(new Object());
           System.out.println("【生产者" + Thread.currentThread().getName()
                   + "】生产一个产品，现库存" + list.size());
           lock.notifyAll();
       }
    }

    public void consumer(){
        synchronized (lock){
            while (list.size() == 0){
                System.out.println("【消费者" + Thread.currentThread().getName()
                        + "】仓库为空");
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
           list.remove(0);
            System.out.println("【消费者" + Thread.currentThread().getName()
                    + "】消费一个产品，现库存" + list.size());
            lock.notifyAll();
        }
    }
}
