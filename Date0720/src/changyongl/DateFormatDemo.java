package changyongl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("9yyy年MM月dd日");

//        String format = sdf.format(d);
//        System.out.println(format);

        String a="2008年08月08日 12:12:12";
        Date d1=sdf.parse(a);
        System.out.println(d1);
    }
}
