/**
 * @author feng
 * @date:2019/12/24
 * @description
 **/
public class ConcretBuilder2 extends Builder {

     Product product = new Product();
    @Override
    void partA() {
        product.add("part XX");
    }

    @Override
    void partB() {
        product.add("part YY");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
