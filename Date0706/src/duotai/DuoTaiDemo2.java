package duotai;

public class DuoTaiDemo2 {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.eat();
        ((Dog)a).lookdoor();
//        AnimalTool a=new AnimalTool();
//        AnimalTool.useAnimal(d);
//        AnimalTool a=AnimalTool.create();
    }

}
