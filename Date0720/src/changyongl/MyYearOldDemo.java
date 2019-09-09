package changyongl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyYearOldDemo {
    public static void main(String[] args) throws ParseException {
//        算一下你来到这个世界多少天?
        String my="1996 10 20";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy MM dd");
        Date dmy=sdf.parse(my);

        Date now=new Date();
        Date time=new Date(now.getTime()-dmy.getTime());
        int year=(int)(time.getTime()/1000/60/60/24/365);
        System.out.println(year);
    }
}
