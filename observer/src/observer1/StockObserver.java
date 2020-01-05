package observer1;

/**
 * @author feng
 * @date:2019/12/24
 * @description  看股票的人，观察者要通知的对象
 **/
public class StockObserver {
    private  String name;
    private Observers observers;

    public StockObserver(Observers observers,String name){
        this.observers = observers;
        this.name = name;
    }
    public void update(){
        System.out.println(observers.getSayWords()+"关闭股票，"+name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
