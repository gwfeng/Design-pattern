/**
 * @author feng
 * @date:2019/12/24
 * @description  指挥者 指挥建造的过程，先建造零件A，再建造零件B
 **/
public class Director {

    private Builder builder;
    public Director(Builder builder){
       this.builder = builder;
    }
    public void creatHouse(){
        builder.partA();
        builder.partB();
    }
}
