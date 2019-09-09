package Date0703;

public abstract class Coach extends Person{
    Coach(){}
    Coach(String name,int age){
        super(name,age);
    }
    public abstract void teach();
}
