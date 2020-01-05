package abstractFactory;

/**
 * @Author: feng
 * @Date: 2019/12/22 16:36
 * @Description:
 */
public class AddFactory implements IFactory {
    @Override
    public Operation getFactory() {
        return new Add();
    }
}