package observer1;

/**
 * 观察者模式
 */
public class Main {

    public static void main(String[] args) {

        Observers observers = new Observers();
        observers.setSayWords("老板来了");
        StockObserver stockObserver = new StockObserver(observers,"小明");
        StockObserver stockObserver1 = new StockObserver(observers,"小红");
        StockObserver stockObserver2 = new StockObserver(observers,"小绿");

        observers.add(stockObserver);
        observers.add(stockObserver1);
        observers.add(stockObserver2);

        observers.Notify();
        System.out.println("移除小明");
        observers.remove(stockObserver);
        observers.Notify();
    }
}
