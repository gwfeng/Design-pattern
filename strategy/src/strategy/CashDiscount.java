package strategy;


/**
 * @Author: feng
 * @Date: 2019/12/22 12:50
 * @Description:
 */
public class CashDiscount extends CashSuper {

   private double rate = 0.1;

    public CashDiscount() {
    }

    public CashDiscount(double rate) {
        this.rate = rate;
    }

    @Override
    public double getCash(double d) {
        return rate*d;
    }
}