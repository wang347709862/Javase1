package properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties p=new Properties();
        Reader r=new FileReader("f:\\user.txt");
        p.load(r);

        Set<String> set=p.stringPropertyNames();
        for (String key : set) {
//            Object value=p.get(key);
//            System.out.println(key);
            if(key.equals("lisi")){
                System.out.println("有");
                p.setProperty("lisi","100");
                break;
            }
        }

        Writer w=new FileWriter("f:\\user.txt");
        p.store(w,"20190722修改");
        r.close();
        w.close();
    }
}
