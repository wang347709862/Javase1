package enclosingClass;

public class TestDemo {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i=o.new Inner();

    }
}
