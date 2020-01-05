package extendmethod;

/**
 * @Author: feng
 * @Date: 2019/12/22 12:18
 * @Description: 服饰
 */
public class Finery extends Person{
    private Person person;

    public void Decorate(Person person){
        this.person = person;
    }

    public void show(){
        if (person!=null){
            person.show();
        }
    }
}