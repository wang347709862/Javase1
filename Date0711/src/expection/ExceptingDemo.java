package expection;

public class ExceptingDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int[] arr = { 1, 2, 3 };

        // 爷爷在最后
        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
            System.out.println("这里出现了一个异常，你不太清楚是谁，该怎么办呢?");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("你访问了不该的访问的索引");
        } catch (Exception e) {
            System.out.println("出问题了");
        }
        System.out.println("over");
    }
}
