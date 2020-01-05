package simpleFactory;


/**
 * @Author: feng
 * @Date: 2019/12/22 16:17
 * @Description:
 */
public class Add extends Operation {

    @Override
    public int getResult(int a,int b) {
        return a+b;
    }
}