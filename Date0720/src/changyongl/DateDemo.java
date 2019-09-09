package changyongl;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
//        Date d=new Date();
//        System.out.println(d);
//        long time = 1000 * 60 * 60; // 1小时
//        Date d2 = new Date(10);
//        System.out.println("d2:" + d2);
        Date d = new Date();

        // 获取时间
        long time = d.getTime();
        System.out.println(time);
        d.setTime(1000);
        System.out.println("d:" + d);
        System.out.println(System.currentTimeMillis());
    }
}
