package a01;

import java.sql.DatabaseMetaData;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test01 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
//        System.out.println(c);
//        System.out.println(c.getTime());
        Date d=c.getTime();
        System.out.println(d.getTime());
        String e="yyyy-MM-dd,HH:mm:ss";
        SimpleDateFormat sdf=new SimpleDateFormat(e);
        String format = sdf.format(d);
        System.out.println(format);
        Properties p=new Properties();
//        Map <String,String> a=new HashMap<>();
    }
}
