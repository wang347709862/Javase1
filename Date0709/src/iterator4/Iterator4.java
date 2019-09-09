package iterator4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterator4 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        // 创建并添加元素
        // String s = "hello";
        // c.add(s);
        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator a=c.iterator();
        while(a.hasNext())
        {
            String s=(String)a.next();
            System.out.println(s);
        }
    }
}
