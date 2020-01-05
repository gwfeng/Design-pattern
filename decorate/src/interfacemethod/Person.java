package interfacemethod;

/**
 * @Author: feng
 * @Date: 2019/12/22 12:16
 * @Description:
 */
public  class Person extends Component{
    private String name;
    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("装扮的人是"+name);
    }
}