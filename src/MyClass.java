import java.util.Arrays;

public class MyClass {


    private  String name;

    private String lastName;

    private  int age;

    private String [] courses;

    public MyClass(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public MyClass(String[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
