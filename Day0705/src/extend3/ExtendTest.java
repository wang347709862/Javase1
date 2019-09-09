package extend3;

public class ExtendTest {
    public static void main(String[] args) {
//        Zi zi=new Zi();
//        zi.show();
        Cat c=new Cat();
        c.setName("tom");
        c.setColor("白的");
        c.setAge(12);
        c.eat();
        c.playGame();

        Dog c2=new Dog("tom2",13,"绿");
        c2.eat();
        c2.lookDoor();
    }
}
