package codekuai;

public class Student {
    static{
        System.out.println("Student静态代码块");
    }
    {
        System.out.println("Student构造代码块");
    }
    public Student(){
        System.out.println("Student构造方法");
    }
}
