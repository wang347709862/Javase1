package Date0628;

public class Code {
    static {
        int a = 1000;
        System.out.println(a);
    }

    //构造代码块
    {
        int x = 100;
        System.out.println(x);
    }

    //构造方法
    public Code(){
        System.out.println("code");
    }

    //构造方法
    public Code(int a){
        System.out.println("code");
    }

    //构造代码块
    {
        int y = 200;
        System.out.println(y);
    }

    //静态代码块
    static {
        int b = 2000;
        System.out.println(b);
    }
}
