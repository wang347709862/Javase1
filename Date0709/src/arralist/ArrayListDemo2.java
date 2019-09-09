package arralist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ArrayListDemo2
{
    public static void main(String[] args) {
        ArrayList a1=new ArrayList();
        a1.add("hello");
        a1.add("world");
        a1.add("java");
        a1.add("world");
        a1.add("java");
        a1.add("world");
        a1.add("world");
        a1.add("world");
        a1.add("world");
        a1.add("java");
        a1.add("world");
        for(int x=0;x<a1.size()-1;x++)
        {
            for(int y=x+1;y<a1.size();y++)
            {
                String a=(String)a1.get(x);
                String b=(String)a1.get(y);
                if(a.equals(b))
                {
                    a1.remove(y);
                    y--;
                }
            }
        }
        System.out.println(a1);
//        Iterator i1=a1.iterator();
//        Set s1=new HashSet();
//        Iterator i1=s1.iterator();
//
//        for(int i=0;i<a1.size();i++)
//        {
//            s1.add(a1.get(i));
//        }
//        System.out.println(s1);
//        ArrayList a2=new ArrayList();
//        while(i1.hasNext())
//        {
//            String s=(String)i1.next();
//            if(!a2.contains(s))
//            {
//                a2.add(s);
//            }
//        }
////        System.out.println(a2);
//        for(int i=0;i<a2.size();i++)
//        {
//            String s=(String)a2.get(i);
//            System.out.println(s);
//        }
    }
}
