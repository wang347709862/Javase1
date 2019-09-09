package changyongl;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
//        System.out.println(0.09 + 0.01);
//        System.out.println(1.00 - 0.32);
//        System.out.println(1.015 * 100);
//        System.out.println(1.301 / 100);
//
//        System.out.println(1.00 - 0.12);
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.01");
        System.out.println("add:" + bd1.add(bd2));
        System.out.println("-------------------");

        BigDecimal bd3 = new BigDecimal("1.0");
        BigDecimal bd4 = new BigDecimal("0.32");
        System.out.println("subtract:" + bd3.subtract(bd4));

        BigDecimal bd7=new BigDecimal("1.301");
        BigDecimal bd8 = new BigDecimal("100");
        System.out.println("divide:" + bd7.divide(bd8));
        System.out.println("divide:"
                + bd7.divide(bd8, 3, BigDecimal.ROUND_HALF_UP));
        System.out.println("divide:"
                + bd7.divide(bd8, 8, BigDecimal.ROUND_HALF_UP));
    }
}
