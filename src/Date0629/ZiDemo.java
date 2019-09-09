package Date0629;

public class ZiDemo  extends FuDemo{
    OtherDemo o=new OtherDemo();
    static{
        System.out.println("子类静态代码块");
    }
    {
        System.out.println("子类构造代码块");
    }
    public ZiDemo(){
        System.out.println("子类构造函数");
        m1();
    }
    public  void m1(){
        m2();
    }
    public  void m2(){

    }

}
