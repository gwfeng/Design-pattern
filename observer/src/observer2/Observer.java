package observer2;

/**
 * @author feng
 * @date:2019/12/24
 * @description 观察者 被通知的对象，也需要进行抽象出来，不同的实现者会有不同的动作（看nba或者股票）
 **/
public abstract class Observer {

    //要做的事情
    public abstract void action();
}
