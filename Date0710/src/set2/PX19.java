package set2;

public class PX19  {
    private String name;
    private int age;

    public PX19(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PX19{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
