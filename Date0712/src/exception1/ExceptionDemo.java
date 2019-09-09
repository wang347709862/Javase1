package exception1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public static void main(String[] args) {
//        String s="2014-11-02 156";
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//
//        try {
//            Date d=sdf.parse(s);
//            System.out.println(d);
//        } catch (ParseException e) {
//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
//        }
//        String s = "2014-11-20";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        Date d = null;
//        try {
//            // System.out.println(10 / 0);
//            d = sdf.parse(s);
//        } catch (ParseException e) {
//            e.printStackTrace();
//            System.exit(0);
//        } finally {
//            System.out.println("这里的代码是可以执行的");
//        }
//
//        System.out.println(d);
        System.out.println(getInt());


    }
    public static void method(){
//        String s="2014-11-20";
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date d=sdf.parse(s);
//        System.out.println(d);
        int a=10;
        int b=0;
        if(b==0)
            throw new ArithmeticException();
        else
            System.out.println(a/b);
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
            return a;//如果这样结果就是40了。
        }

}}
