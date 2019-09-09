package extend;

public class Son extends Father {
    public int num=20;
    public int num2=30;
    public void show(){
        int num=40;
        System.out.println(num);
        System.out.println(super.num);
    }
    public void function() {
        System.out.println();
    }
}
