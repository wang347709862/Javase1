package Date0629;

public class FuDemo {
    OtherDemo o=new OtherDemo();
    static{
        System.out.println("父类静态代码块");
    }
    {
        System.out.println("父类构造代码块");
    }
    public FuDemo(){
        System.out.println("父类构造函数");
    }
}
