package iterator3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        String[] s1={"黑龙江","浙江","江西","广东"};
        String[] s2={"哈尔滨","温州","南昌","广州"};
        HashMap h1=new HashMap();
        for(int i=0;i<s1.length;i++)
        {
            h1.put(s1[i],s2[i]);
        }
//
        Set s=h1.keySet();
        Iterator i1=s.iterator();
            while(i1.hasNext())
            {
                System.out.println(h1.get(i1.next()));
            }



    }
}
