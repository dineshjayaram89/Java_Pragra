package Feb10.Encapsulation;

public class ReadOnlyClass {
    private String name;
    private String age;

    public ReadOnlyClass(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }
}
