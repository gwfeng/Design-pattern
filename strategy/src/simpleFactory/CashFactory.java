package simpleFactory;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @Author: feng
 * @Date: 2019/12/22 12:52
 * @Description:
 */
public class CashFactory {

    public static CashSuper getCashImpl(int type) {
        CashSuper cashSuper = null;
        switch (type) {
            case 0:
                cashSuper = new CashNormal();
                break;
            case 1:
                cashSuper = new CashDiscount(0.5);
                break;
            case 2:
                cashSuper = new CashDiscount();
                break;
            default:
                cashSuper = new CashDiscount1();
        }
        return cashSuper;
    }
}