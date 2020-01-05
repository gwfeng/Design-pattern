package strategy;


import simpleFactory.CashDiscount;
import simpleFactory.CashDiscount1;
import simpleFactory.CashNormal;
import simpleFactory.CashSuper;

/**
 * @Author: feng
 * @Date: 2019/12/22 13:09
 * @Description: 包含了工厂和获取数据的方法
 */
public  class CashContext {

    CashSuper cashSuper = null;
    //内部工厂
    public CashContext(int type) {
        switch (type) {
            case 0:
                cashSuper = new CashNormal();
                break;
            case 1:
                cashSuper = new simpleFactory.CashDiscount(0.5);
                break;
            case 2:
                cashSuper = new CashDiscount();
                break;
            default:
                cashSuper = new CashDiscount1();
        }
    }
    public double getResult(double d){
        return cashSuper.getCash(d);
    }
}