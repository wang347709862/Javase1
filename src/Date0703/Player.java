package Date0703;

import Date0701.People;

public abstract class Player extends Person {
    Player(){}
    Player(String name,int age){
        super(name,age);
    }
    public abstract void study();
}
