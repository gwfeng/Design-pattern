package simpleFactory;

/**
 * @Author: feng
 * @Date: 2019/12/22 12:50
 * @Description:
 */
public class CashNormal implements CashSuper {
    @Override
    public double getCash(double d) {
        return d;
    }
}