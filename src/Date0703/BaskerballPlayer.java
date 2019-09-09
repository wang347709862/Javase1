package Date0703;

public class BaskerballPlayer extends Player{
    public BaskerballPlayer(){}
    public BaskerballPlayer(String name,int age){
        super(name,age);

    }
    public void study(){
        System.out.println("篮球运动员学习如何发球和投篮");
    }
    public void eat(){
        System.out.println("乒乓运动员吃牛肉，喝牛奶");
    }
}
