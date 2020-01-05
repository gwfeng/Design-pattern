/**
 * 原型模式  浅复制，深复制  //java 的clone方法是深复制
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1= new Person("fsd","45","man");
        p1.setExperience("1990","huawei");
        System.out.println("p1:"+p1.toString());
        Person p3 = p1.clone();
        p3.setExperience("1992","tengxun");
        System.out.println("p3:"+p3.toString());
//        System.out.println(p1.toString());
//        Person p2 = p1.clone();
//        System.out.println(p1.equals(p2));
//        System.out.println(p1 == p2);
//        System.out.println(p2.toString());
//        p2.setInfo("90","female");
//        System.out.println(p2.toString());
    }
}
