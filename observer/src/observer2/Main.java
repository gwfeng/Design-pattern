package observer2;

/**
 * @author feng
 * @date:2019/12/24
 * @description 观察者模式
 **/
public class Main {
    public static void main(String[] args) {

        Notify noti = new MsNotify();
//        Notify noti = new BossNotify();
        StockObserver stockObserver = new StockObserver("小明",noti);
        NBAObserver nbaObserver = new NBAObserver("小红",noti);
        NBAObserver nbaObserver1 = new NBAObserver("小绿",noti);

        noti.add(stockObserver);
        noti.add(nbaObserver);
        noti.add(nbaObserver1);

        noti.setSayWolds("老板来了");
        noti.Notify();

        //去掉小明
        System.out.println("====去掉小明=====");
        noti.remove(stockObserver);
        noti.Notify();
        
        
    }
}
