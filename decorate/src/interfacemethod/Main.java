package interfacemethod;


/**
 * @Author: feng
 * @Date: 2019/12/22 12:38
 * @Description:  接口方式
 */
public class Main {
    public static void main(String[] args) {
        Person p = new Person("fsf");
        Shirt shirt = new Shirt();
        Shoose shoose = new Shoose();
        shirt.Decorate(p);
        shoose.Decorate(shirt);
        shoose.show();
    }
}