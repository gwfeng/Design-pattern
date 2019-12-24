/**
 * @author feng
 * @date:2019/12/24
 * @description 题目父类,题目都是一样的，写在父类中；答案是不一样的，抽象出来
 **/
public abstract class Paper {
    public void questionnA(){
        System.out.println("题目A");
        System.out.println("答案："+answerTemlateA());
    }

    public void questionnB(){
        System.out.println("题目B");
        System.out.println("答案："+answerTemlateB());
    }

    public abstract String  answerTemlateA();
    public abstract String  answerTemlateB();
}
