package properties;

import java.io.*;
import java.util.Properties;

public class PropertiesTest2 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        Reader r = new FileReader("f:\\count.txt");
        prop.load(r);
        r.close();

        String value=prop.getProperty("count");
        int num=Integer.parseInt(value);
        if(num>5){
            System.out.println("游戏试玩已结束，请付费。");
            System.exit(0);
        }else{
            num++;
            prop.setProperty("count",String.valueOf(num));
            Writer w=new FileWriter("f:\\count.txt");
            prop.store(w,"呵呵aaa");
            w.close();
        }

    }
}
