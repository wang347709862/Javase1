package abstract2;

public class AbstractTest {
    public static void main(String[] args) {
        Animal a=new Dog("ton",13);
        a.eat();
        System.out.println(a.toString());
    }
}
