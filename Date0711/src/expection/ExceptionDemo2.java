package expection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        // int a = 10;
        // int b = 0;
        // if (b != 0) {
        // System.out.println(a / b);
        // }

        String s = "2014-11-20";
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // Date d = sdf.parse(s);
        try {
            Date d = sdf.parse(s);
            System.out.println(d);
        } catch (ParseException e) {
            // e.printStackTrace();
            System.out.println("解析日期出问题了");
        }
    }
}
