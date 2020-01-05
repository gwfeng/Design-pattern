package simpleFactory;

/**
 * 简单工厂模式
 */
public class Main {

    public static void main(String[] args) {
      CashSuper cashSuper = CashFactory.getCashImpl(2);
      double d = cashSuper.getCash(20);
        System.out.println(d);

    }
}
