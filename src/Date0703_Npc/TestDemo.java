package Date0703_Npc;
import java.util.Scanner;
public class TestDemo {

    public static void main(String[] args) {
        //初始化用户
        User u1 = new User("王利杰", 0);//用户
        User npc1 = new User("异世界的卡密", 1);//npc

       Prepare.prepare(u1,npc1);



    }
}
