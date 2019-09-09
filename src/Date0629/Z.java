package Date0629;

public class Z extends X{
    static{
        System.out.println("Z静态代码块");
    }

    Y y = new Y();
    {
        System.out.println("Z构造代码块");
    }
    Z() {
        //super
        System.out.println("Z");
    }
    public static void main(String[] args) {
        new Z();
    }
}
