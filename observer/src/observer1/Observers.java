package observer1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author feng
 * @date:2019/12/24
 * @description 观察者 秘书
 **/
public class Observers {
    private List<StockObserver> list = new ArrayList<>();

    private String sayWords;

    public void add(StockObserver observer){
        list.add(observer);
    }

    public void remove(StockObserver observer){
        list.remove(observer);
    }

    public void show(){
        for (StockObserver o:list){
            System.out.println(o.getName());
        }
    }
    //观察者通知 需要更新的对象
    public void Notify(){
        for (StockObserver o:list){
            o.update();
        }
    }

    public List<StockObserver> getList() {
        return list;
    }

    public void setList(List<StockObserver> list) {
        this.list = list;
    }

    public String getSayWords() {
        return sayWords;
    }

    public void setSayWords(String sayWords) {
        this.sayWords = sayWords;
    }
}
