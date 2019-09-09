package properties;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo2 {
    public static void main(String[] args) throws IOException {
//        myLoad();
        myStore();
    }
    private static void myStore() throws IOException{
        Properties prop = new Properties();

        prop.setProperty("林青霞", "27");
        prop.setProperty("武鑫", "30");
        prop.setProperty("刘晓曲", "18");

        Writer w=new FileWriter("f:\\a.txt");
        prop.store(w,"helloworld");
        w.close();
    }
    private static void myLoad()throws IOException{
        Properties prop = new Properties();
        Reader r=new FileReader("f:\\prop.txt");
        prop.load(r);
        r.close();
        System.out.println(prop);
    }
}
