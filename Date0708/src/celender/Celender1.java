package celender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Celender1 {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance() ;
        System.out.println(c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+(c.get(Calendar.DATE)-1)+"日");
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s=sdf.format(d);
        System.out.println(s);

    }
}
