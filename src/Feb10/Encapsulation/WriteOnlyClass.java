package Feb10.Encapsulation;

public class WriteOnlyClass {

    private String name;
    private String age;

    public WriteOnlyClass(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
}
