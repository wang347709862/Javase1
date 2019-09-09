package test01;

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        Map m1=new HashMap();
        m1.put("苹果1","苹果树");
        m1.put("苹果2","苹果树");
        m1.put("苹果3","苹果树");
        m1.put("苹果4","苹果树");
        m1.put("苹果5","苹果树");
        m1.put("桃子1","桃子树");
        m1.put("桃子2","桃子树");
        m1.put("桃子3","桃子树");
        m1.put("桃子4","桃子树");
        m1.put("桃子5","桃子树");
        Set s=m1.keySet();
        Iterator i=s.iterator();
        while(i.hasNext())
        {
            Object o=i.next();
            System.out.println(""+m1.get(o)+":"+o);
        }
//        m1.keySet();
//        System.out.println(m1);

    }
}
