import java.util.Collection;
import java.util.HashMap;

public class setcollection {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm=new HashMap();
        hm.put(1,5);
        hm.put(2,6);
        hm.put(3,7);
        hm.put(4,8);
        Collection<Integer> values = hm.values();
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}
