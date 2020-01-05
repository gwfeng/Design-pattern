/**
 * @author feng
 * @date:2019/12/24
 * @description
 **/
public class ConcretBuilder1 extends Builder {

     Product product = new Product();
    @Override
    void partA() {
        product.add("part a");
    }

    @Override
    void partB() {
        product.add("part b");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
