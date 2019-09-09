package Date0629;

public class X {
    static{
        System.out.println("X静态代码块");
    }
    {
        System.out.println("X构造代码块");
    }
    Y b = new Y();
    X() {
        System.out.println("X");
    }
}
