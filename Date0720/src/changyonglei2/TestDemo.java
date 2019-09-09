package changyonglei2;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) throws Throwable {
//        long start=System.currentTimeMillis();
//        Person p=new Person();
//        p.finalize();
//
//        for (int x = 0; x < 100000; x++) {
//            System.out.println("hello" + x);
//        }
//        long end=System.currentTimeMillis();
//        System.out.println(end-start);
        int[] arr = { 11, 22, 33, 44, 55 };
        int[] arr2 = { 6, 7, 8, 9, 10 };
        System.arraycopy(arr,1,arr2,2,2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }
}
