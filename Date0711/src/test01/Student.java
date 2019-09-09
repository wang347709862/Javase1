package test01;

public class Student {
    private String name;
    private int age;
    private String sex;    //可以访问age

    public boolean compare(Student s){
        return this.age==s.age;
    }
}