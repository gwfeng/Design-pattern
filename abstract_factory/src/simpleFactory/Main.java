package simpleFactory;


/**
 * 抽象工厂模式
 */
public class Main {

    public static void main(String[] args) {
        Operation p = OperationFactory.getOperaton("+");
        int re = p.getResult(2,5);
        System.out.println(re);
    }
}
