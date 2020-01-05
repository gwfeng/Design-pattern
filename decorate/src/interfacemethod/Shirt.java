package interfacemethod;

/**
 * @Author: feng
 * @Date: 2019/12/22 12:25
 * @Description: 具体的服饰 衬衫
 */
public class Shirt extends Finery {

    @Override
    public void show(){
        System.out.println("衬衫");
        super.show();
    }
}