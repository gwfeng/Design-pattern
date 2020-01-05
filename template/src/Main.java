/**
 * 模板模式
 */
public class Main {

    public static void main(String[] args) {
        Paper paper = new StudentA();
        paper.questionnA();
        paper.questionnB();

        Paper paper1 = new StudentB();
        paper1.questionnA();
        paper1.questionnB();
    }
}
