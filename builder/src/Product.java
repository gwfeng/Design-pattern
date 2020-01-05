import java.util.ArrayList;
import java.util.List;

/**
 * @author feng
 * @date:2019/12/24
 * @description 产品由具体的partB 具体的partB构成
 **/
public class Product {
    //添加产品
    List<String> list = new ArrayList();
    public void add(String part){
        list.add(part);
    }

    public void show(){
        for (String s:list){
            System.out.println(s);
        }
    }
}
