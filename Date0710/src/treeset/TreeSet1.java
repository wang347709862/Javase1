package treeset;

import javax.jws.soap.SOAPBinding;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        Set s=new TreeSet();
        User u1=new User(1);
        User u2=new User(10);
        User u3=new User(9);
        User u4=new User(7);
        User u5=new User(15);
        User u6=new User(7);

        s.add(u1);
        s.add(u2);
        s.add(u3);
        s.add(u4);
        s.add(u5);
        s.add(u6);
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            User u=(User)i.next();
            System.out.println(u.getAge());
        }
    }
}
