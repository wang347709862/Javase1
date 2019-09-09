package extend3;

public class Cat extends Animal{
    Cat(){}
    Cat(String name, int age, String color){
        super(name,age,color);
    }

    public void playGame(){
        System.out.println("猫玩英雄联盟");
    }
}
