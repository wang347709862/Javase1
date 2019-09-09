package Date0703;

public class TestDemo3 {
    public static void main(String[] args) {
        System.out.println("程序开始了");
        try {
            System.out.println("程序正在执行");
            Thread.sleep(3000);
            System.out.println("程序结束了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
