package iteratoe2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iderator2 {


    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(1);
        a.add(6);
        a.add(3);
        a.add(11);
        a.add(20);
        int m=10;
        ListIterator i=a.listIterator();
        while(i.hasNext())
        {
         if(m<(Integer) i.next())
         {
             int index=i.nextIndex();
             i.previous();
             i.add(m);
             break;
         }
        }
        ListIterator i2=a.listIterator();
        while(i2.hasNext())
            System.out.println(i2.next());
    }
}
