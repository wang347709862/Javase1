package parament;

public class TestDemo2 {
    public static void main(String[] args) {
        Fu f=new Zi();
        System.out.println(f.num);
//        ((Zi) f).set();
        f.set();
        System.out.println(f.num);
    }
}
