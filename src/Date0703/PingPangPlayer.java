package Date0703;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class PingPangPlayer extends Player implements SpeakEnglish{
    public PingPangPlayer(){}
    public PingPangPlayer(String name,int age){
        super(name,age);

    }
    public void study(){
        System.out.println("乒乓运动员学习如何发球和接球");
    }
    public void eat(){

        System.out.println("乒乓运动员吃大白菜，喝小米粥");
    }
    public void speak(){
        System.out.println("乒乓运动员说英语");
    }
}
