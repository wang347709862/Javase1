package interface1;

public class TestDemo {
    public static void main(String[] args) {
        Son s=new Son();
        s.show();
//        Son.C2 c=new Son.C2();
        Son.C2 c=s.new C2();
        c.show();
    }
}
