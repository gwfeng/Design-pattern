package extendmethod;

import extendmethod.Person;
import extendmethod.Shirt;
import extendmethod.Shoose;

/**
 * 装饰模式
 */
public class Main {

    public static void main(String[] args) {

        Person p = new Person("fgw");
        Shirt shirt = new Shirt();
        Shoose shoose = new Shoose();
        shirt.Decorate(p);
        shoose.Decorate(shirt);
        shoose.show();
    }
}
