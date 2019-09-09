package student;

public class ArgsTest {
    public static void main(String[] args) {
        StudentDemo sd=new StudentDemo();
        Student s=new Student();
        System.out.println(s.getString());
        s.method("林青霞");
        System.out.println(s.fuction("hello","world"));
//        s.show();
//
//        Student s2=new Student("dasd");
//        s2.show();
//
//        Student s3=new Student(12);
//        s3.show();
//        s.setName("我自己");
//        s.setAge(156);
//        s.show();
//        new Student("我",12).show();
//        new Student().show();
//
//        sd.method(s);
//        new StudentDemo().method(new Student());

    }
}
