package Date0629;

public class Y {
    static{
        System.out.println("Y静态代码块");
    }
    {
        System.out.println("Y构造代码块");
    }
    Y() {
        System.out.println("Y");
    }
}
