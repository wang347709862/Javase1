package extend3;

public class Z extends X{
    static{
        System.out.println("Z静态代码块");
    }
    {
        System.out.println("Z构造代码块");
    }
   Z(){
        System.out.println("Z构造方法");
    }
    Y b=new Y();

    public static void main(String[] args) {
        new Z();
    }//x静z静x构y静y构y构x构z构y构y构z构
}
