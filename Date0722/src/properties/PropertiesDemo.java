package properties;

import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) {
//        Properties<String,String> prop=new Properties();
        Properties prop = new Properties();
        prop.setProperty("张三", "30");
        prop.setProperty("李四", "40");
        prop.setProperty("王五", "50");

        Set<String> set=prop.stringPropertyNames();
        for (String key : set) {
            String value=prop.getProperty(key);
            System.out.println(key+"---"+value);
        }

//        Set set=prop.keySet();
//        for (Object o : set) {
//            Object value=prop.get(o);
//            System.out.println(o+"---"+value);
//        }
    }
}
