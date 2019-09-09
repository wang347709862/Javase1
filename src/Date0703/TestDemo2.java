package Date0703;

public class TestDemo2 {
    public static void main(String[] args) {
        PingPangPlayer ppp=new PingPangPlayer();
        ppp.setName("王浩");
        ppp.setAge(33);
        System.out.println(ppp.getName()+"---"+ppp.getAge());
        ppp.eat();
        ppp.sleep();
        ppp.study();
        ppp.speak();

        System.out.println("=============");
        BaskerballPlayer bbb=new BaskerballPlayer("姚明",34);
        bbb.eat();
        bbb.sleep();
        bbb.study();

    }

}
