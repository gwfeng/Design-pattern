package simpleFactory;


/**
 * @Author: feng
 * @Date: 2019/12/22 16:21
 * @Description:
 */
public class OperationFactory {
    public static Operation getOperaton(String o){
        Operation p = null;
        switch (o){
            case "+":
                p = new Add();
                break;
            case "-":
                p=new Sub();
                break;
        }
        return p;
    }
}