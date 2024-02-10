package Feb10.Aggregation;

public class Student {
    String name;
    String id;
    String age;
    Address address;

    public Student(String name, String id, String age, Address address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student : {" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", address=" + address +
                '}';
    }
}
