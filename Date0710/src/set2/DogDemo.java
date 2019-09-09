package set2;

import java.util.HashSet;
import java.util.Set;

public class DogDemo {
    public static void main(String[] args) {
        Set<Dog> d=new HashSet<>();
        Dog d1 = new Dog("秦桧", 25, "红色", '男');
        Dog d2 = new Dog("高俅", 22, "黑色", '女');
        Dog d3 = new Dog("秦桧", 25, "红色", '男');
        Dog d4 = new Dog("秦桧", 20, "红色", '女');
        Dog d5 = new Dog("魏忠贤", 28, "白色", '男');
        Dog d6 = new Dog("李莲英", 23, "黄色", '女');
        Dog d7 = new Dog("李莲英", 23, "黄色", '女');
        Dog d8 = new Dog("李莲英", 23, "黄色", '男');

        d.add(d1);
        d.add(d2);
        d.add(d3);
        d.add(d4);
        d.add(d5);
        d.add(d6);
        d.add(d7);
        d.add(d8);
        for(Dog dx:d)
        {
            System.out.println(dx.getName()+"\t"+dx.getColor()+"\t"+dx.getAge()+"\t"+dx.getSex());
        }
    }
}
