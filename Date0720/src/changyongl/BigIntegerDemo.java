package changyongl;

import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        Integer i = Integer.MAX_VALUE;
        System.out.println(2147483647+1);
        byte a=127;
        System.out.println(a+2147483647);
        long a2=2147483647+2;
        System.out.println(a2);
        BigInteger bi = new BigInteger("2147483648");
        System.out.println("bi:" + bi);
    }
}
