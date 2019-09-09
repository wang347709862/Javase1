package person;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1=new Person("邓丽君",16,"中国");
//        p1.show();
//
//        Person p2=new Person("杨幂",22);
//        p2.show();
//
//        p2.country="美国";
//        p2.show();
//        p1.show();
        System.out.println(p1.num);
        System.out.println(Person.num2);
        System.out.println(p1.num2);

    }

}
