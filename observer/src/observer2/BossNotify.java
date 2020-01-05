package observer2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author feng
 * @date:2019/12/24
 * @description 通知者 ,也抽象出来，可能是多个不同的通知者  此处是秘书/也有可能是其他人
 **/
public  class BossNotify extends Notify{

    List<Observer> list = new ArrayList<>();

    @Override
    public void add(Observer observer){
        list.add(observer);
    }
    @Override
    public void remove(Observer observer){
        list.remove(observer);
    }

    //观察者通知 需要更新的对象
    @Override
    public void Notify(){
        for (Observer o:list){
            o.action();
        }
    }

}
