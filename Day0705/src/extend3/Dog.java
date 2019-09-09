package extend3;

public class Dog extends Animal{
    Dog(){}
    Dog(String name, int age, String color){
        super(name,age,color);
    }
    public void lookDoor(){
        System.out.println("狗看门");
    }
}
