package duotai;

public class AnimalTool {

    private static AnimalTool a=new AnimalTool();
    private AnimalTool(){}

    public static AnimalTool create(){
        return a;
    }
    public static void useAnimal(Animal a){
        a.eat();
//        a.sleep();
    }
}
