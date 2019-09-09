package enclosingClass2;

public class Outer {
    private int num=10;
    private static int num2=100;
    public static class Inner{
        public void show(){
            System.out.println(num2);
        }
        public static void show2(){
            System.out.println(num2);
        }
    }
}
