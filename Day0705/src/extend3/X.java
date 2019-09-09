package extend3;

public class X {
    static{
        System.out.println("X静态代码块");
    }
    {
        System.out.println("X构造代码块");
    }
    X(){
        System.out.println("X构造方法");
    }
    Y b=new Y();
}
