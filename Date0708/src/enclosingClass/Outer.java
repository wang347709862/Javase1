package enclosingClass;

public class Outer {
    private int num=10;
    class Inner{
        public void show(){
            System.out.println(num);
        }
    }
    public void method(){
//        show();
        Inner i=new Inner();
        i.show();
    }
}
