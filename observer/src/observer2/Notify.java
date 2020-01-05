package observer2;

/**
 * @author feng
 * @date:2019/12/24
 * @description  通知抽象，可能会有多个通知实现者
 **/
public abstract class Notify {

    public abstract void add(Observer observer);

    public abstract void remove(Observer observer);

    //观察者通知 需要更新的对象
    public abstract  void Notify();

    //通知者的状态，比如想说的话
    public String sayWolds;

    public String getSayWolds() {
        return sayWolds;
    }

    public void setSayWolds(String sayWolds) {
        this.sayWolds = sayWolds;
    }
}
