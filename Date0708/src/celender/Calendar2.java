package celender;

import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;

public class Calendar2 {
    public static void main(String[] args) {
       Calendar c=Calendar.getInstance();
       c.set(2019,2,1);
       c.add(Calendar.DATE,-1);
        System.out.println(c.get(Calendar.DATE));

    }
}
