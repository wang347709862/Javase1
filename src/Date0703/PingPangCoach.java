package Date0703;

public class PingPangCoach extends Coach implements SpeakEnglish{
    PingPangCoach(){}
    PingPangCoach(String name,int age){
        super(name,age);
    }


    public void eat(){
        System.out.println("乒乓教练吃大白菜，喝小米粥");
    }//抽象方法吃
    public void teach(){
        System.out.println("乒乓交教练教如何发球和接球");
    }

    @Override
    public void speak() {
        System.out.println("乒乓教练说英语");
    }
}
