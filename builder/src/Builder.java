/**
 * @author feng
 * @date:2019/12/24
 * @description 零部件A,B 以及获得零件的组合结果
 **/
public abstract class Builder {
    abstract void partA();
    abstract void partB();
    abstract Product getResult();
}
