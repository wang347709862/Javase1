package enclosingClass;

public class Out {
    private int num=10;
    private static int num2=100;
    public static class Heart{
        public void operator(){
            System.out.println("心脏搭桥");
        }
    }

    public void method(){
        Heart h=new Heart();
        h.operator();
    }
}
