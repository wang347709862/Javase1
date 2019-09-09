import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        List<String> l=new ArrayList();

        String a="abc";
        String b="bcd";
        l.add(a);
        l.add(b);

        String s=l.get(0)+l.get(1);
        String[] sp=s.split("");
        Map<String,Integer> m=new HashMap<String, Integer>();
        m.put("a",0);
        m.put("b",0);
        m.put("c",0);

        int counta=0;
        int countb=0;
        int countc=0;

        for(int i=0;i<sp.length;i++)
        {

            if(sp[i].equals("a")){
                counta++;
                m.put(sp[i],counta);
            }
            if(sp[i].equals("b")){
                countb++;
                m.put(sp[i],countb);
            }
            if(sp[i].equals("c")){
                countc++;
                m.put(sp[i],countc);
            }
        }
        System.out.println(m);
    }
}
