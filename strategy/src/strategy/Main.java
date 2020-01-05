package strategy;

/**
 * 策略模式
 */
public class Main {

    public static void main(String[] args) {
        CashContext cashContext = new CashContext(1);
        double d= cashContext.getResult(40);
        System.out.println(d);
    }
}
