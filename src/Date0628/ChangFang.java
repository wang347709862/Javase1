package Date0628;

public class ChangFang {
    static{
        System.out.println("这是静态代码块");
    }
    {
        System.out.println("这是构造代码块");
    }
    public ChangFang(){
//        length=1;
//        this.length=2;
//        width=3;

        System.out.println("父类构造方法");
    }
    public ChangFang(int a){
//        length=1;
//        this.length=2;
//        width=3;

        System.out.println("父类构造方法");
    }
//    ChangFang(int a,int b){
//        length=a;
//        width=b;
//    }
    public int length;
    public static int width;
    public int third;
    public int mianJi(){
        return this.length*this.width;
    }
    public void setallname(int a){
        length=a;
    }
}
