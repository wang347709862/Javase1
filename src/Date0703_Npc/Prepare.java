package Date0703_Npc;

import java.util.Scanner;

public class Prepare {

    public static void prepare(User u1,User npc1){
        Scanner sc = new Scanner(System.in);
        String[][] allTalking = Data.allTalking;//6*3
        System.out.println("欢迎来到情感电台，你有什么想说的？以0结束");
        while(true)
        {
            int have=0;//保存是否在数据库中有对应回答的变量，为1代表有
            String u1Talking=sc.next();
            if (u1Talking.equals("0"))
            {
                System.out.println("本次到此结束，欢迎下次再来！");
                break;
            }
            System.out.println("说："+u1Talking);
            for(int i=0;i<6;i++)
            {
                if(u1Talking.equals(allTalking[i][0]))
                {
                    int ran=(int)(Math.random()*3+1);//对话数组对应的随机一句话
                    System.out.println(npc1.name+"说："+allTalking[i][ran]);
                    have=1;//有对应的话
                    break;
                }
            }
            if(have==0){
                System.out.println(u1.name+"说：你说什么我不太懂");
            }
        }
    }
}
