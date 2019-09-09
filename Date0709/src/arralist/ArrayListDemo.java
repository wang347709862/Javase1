package arralist;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListDemo {
    public static void main(String[] args) {
//        ArrayList a1=new ArrayList();
//        a1.add("hello");
//        a1.add("world");
//        a1.add("java");
//
//        Iterator i1=a1.listIterator();
//        while(i1.hasNext())
//        {
//            String s=(String)i1.next();
//            System.out.println(s);
//        }
        Vector v1=new Vector();
        v1.addElement("hello");
        v1.addElement("world");
        v1.addElement("java");

        Enumeration e1=v1.elements();
        while(e1.hasMoreElements())
        {
            String s=(String)e1.nextElement();
            System.out.println(s);
        }
        for(int i=0;i<v1.size();i++)
        {
            String s=(String)v1.elementAt(i);
            System.out.println(s);
        }
    }
}
