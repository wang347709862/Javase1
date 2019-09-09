package person;

public class Person {
    String name;
    int age;
    int num=10;
    static int num2=20;
    static String country;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age,String country) {
        this.name = name;
        this.age = age;
        this.country=country;
    }

    public void show(){
        System.out.println("name:"+this.name+",age:"+this.age+",country:"+country);
    }
}
