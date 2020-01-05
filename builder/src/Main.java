/**
 * 建造者模式
 */
public class Main {

    public static void main(String[] args) {
        //创建好零件
        Builder b1 = new ConcretBuilder1();
       //创建指挥者
        Director d = new Director(b1);
        //指挥者调用创建房子的方法（方法里面有固定的零件）
        d.creatHouse();
        //获取结果
        Product p = b1.getResult();
        //展示
        p.show();

        Builder b2 = new ConcretBuilder2();
        Director d2 = new Director(b2);
        d2.creatHouse();
        Product p2 = b2.getResult();
        p2.show();
    }
}
