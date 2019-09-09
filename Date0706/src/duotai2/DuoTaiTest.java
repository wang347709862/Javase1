package duotai2;

public class DuoTaiTest {
    public static void main(String[] args) {
        Person p =new SouthPerson();
        p.eat();
        ((SouthPerson) p).jingShang();
        ((SouthPerson) p).eat();
    }
}
