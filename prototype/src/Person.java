/**
 * @Author: feng
 * @Date: 2019/12/22 17:16
 * @Description:
 */
public class Person implements Cloneable{
    private String name;
    private String age;
    private String sex;

    private Experience experience;

    public Person(String name,String age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setInfo(String age,String sex){
        this.age = age;
        this.sex = sex;
    }

    public void setExperience(String time,String company){
        experience = new Experience(time,company);
    }

    //原型模式主要是实现clone方法
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", experience=" + experience +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}