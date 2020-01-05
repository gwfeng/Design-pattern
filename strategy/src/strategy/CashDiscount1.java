package strategy;


/**
 * @Author: feng
 * @Date: 2019/12/22 12:50
 * @Description:
 */
public class CashDiscount1 extends CashSuper {
    @Override
    public double getCash(double d) {
        return 0.8*d;
    }
}