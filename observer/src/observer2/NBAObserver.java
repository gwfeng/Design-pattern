package observer2;

/**
 * @author feng
 * @date:2019/12/24
 * @description nba观察者 实现类
 **/
public class NBAObserver extends Observer {

    private String name;
    private Notify notifyPerson;
    public NBAObserver(String name, Notify notifyPerson) {
        this.name = name;
        this.notifyPerson = notifyPerson;
    }

    @Override
    public void action() {
        System.out.println(notifyPerson.getSayWolds()+"关闭NBA"+name);
    }
}
