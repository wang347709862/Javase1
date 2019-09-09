package Date0628;

public class PersonDemo {
    public static void main(String[] args) {
        //创建对象1
        Person p1 = new Person("邓丽君",16,"中国");
        p1.show();

        //创建对象2
        //Person p2 = new Person("杨幂",22,"中国");
        //p2.show();
        Person p2 = new Person("杨幂",22);
        p2.show();

        //创建对象3
        //Person p3 = new Person("凤姐",20,"中国");
        //p3.show();
        Person p3 = new Person("凤姐",20);
        p3.show();

        Person.country= "美国";
        p3.show();

        p1.show();
        p2.show();
    }
}
