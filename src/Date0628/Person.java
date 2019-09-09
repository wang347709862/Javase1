package Date0628;

public class Person {
    String name;
    //年龄
    int age;
    //国籍
    //String country;
    static String country;

    public Person(){}

    public Person(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name,int age,String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void show() {
        System.out.println("姓名："+name+",年龄："+age+",国籍："+country);
    }
}
