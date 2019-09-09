package employee;

public class AbstractTest4 {
    public static void main(String[] args) {
        Employee e1=new Programer("林青霞","czb",18000);
        e1.work();
        System.out.println(e1.toString());
//        Employee e2=
        Programer p1=new Programer();
        p1.setName("d");
        System.out.println(p1.getName());
    }
}
