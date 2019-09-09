package interface3;

public class PingpongPlayer extends Player implements SpeakEnglish {
    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    public void eat(){
        System.out.println("乒乓球运动员吃大白菜，喝小米粥");
    }
    public void speak(){
        System.out.println("乒乓球运动员说英语");
    }
    public void study(){
        System.out.println("乒乓球运动员");
    }
}
