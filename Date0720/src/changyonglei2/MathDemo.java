package changyonglei2;

import java.util.Random;

public class MathDemo {
    public static void main(String[] args) {
//        System.out.println("E:" + Math.E);
//        System.out.println("ceil:" + Math.ceil(12.34));
//        System.out.println("ceil:" + Math.ceil(12.56));
//        System.out.println("--------------");
//        System.out.println("max:" + Math.max(Math.max(12, 23), 18));
//        System.out.println("pow:" + Math.pow(2, 3));
//        System.out.println("--------------");
//        System.out.println("round:" + Math.round(12.34));
//        System.out.println("round:" + Math.round(12.56f));
//        System.out.println("sqrt:"+Math.sqrt(4));
//        int start=23;
//        int end=65;
//        int number=(int)Math.random()*(end-start)+start
//        int start=1;
//        int end=2;
//        int number=(int)Math.random()*(end-start+1)+start;
        Random r = new Random(1011);
        Random r2 = new Random(1011);


            // int num = r.nextInt();
            int num = r.nextInt(100) + 1;
            int num2=r2.nextInt(10) + 1;
            System.out.println(num);
            System.out.println(num2);

    }
}
