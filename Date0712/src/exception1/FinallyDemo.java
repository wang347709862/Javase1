package exception1;

public class FinallyDemo {
    public static void main(String[] args) {
        System.out.println(getInt());
    }

    public static int getInt() {
        int a = 10;
        try {
            System.out.println(a / 0);
            a = 20;
        } catch (ArithmeticException e) {
            a = 30;
            return a;
            /*
             * return a在程序执行到这一步的时候，这里不是return a而是return 30;这个返回路径就形成了。
             * 但是呢，它发现后面还有finally，所以继续执行finally的内容，a=40
             * 再次回到以前的返回路径，继续走return 30;
             */
        } finally {
            a = 40;
//            return a;//如果这样结果就是40了。
        }
        return a;
    }
}
