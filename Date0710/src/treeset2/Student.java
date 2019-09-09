package treeset2;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super();
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
    public int compareTo(Student s) {
        int num=this.name.length()-s.name.length();
        int num2= num == 0 ? this.name.compareTo(s.name) : num;
        int num3= num2 == 0 ? this.age - s.age : num2;
        return num3;
    }
}
