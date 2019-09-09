package testall;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap <String,HashMap<String,ArrayList<Student>>> czbkMap=new HashMap<>();

        HashMap<String,ArrayList<Student>> bjCzbkMap=new HashMap<>();
        ArrayList<Student> array1=new ArrayList<>();
        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("风清扬", 30);
        array1.add(s1);
        array1.add(s2);
        ArrayList<Student> array2 = new ArrayList<Student>();
        Student s3 = new Student("赵雅芝", 28);
        Student s4 = new Student("武鑫", 29);
        array2.add(s3);
        array2.add(s4);
        bjCzbkMap.put("基础班",array1);
        bjCzbkMap.put("就业班",array2);
        czbkMap.put("北京校区", bjCzbkMap);

        HashMap<String, ArrayList<Student>> xaCzbkMap = new HashMap<String, ArrayList<Student>>();
        ArrayList<Student> array3 = new ArrayList<Student>();
        Student s5 = new Student("范冰冰", 27);
        Student s6 = new Student("刘意", 30);
        array3.add(s5);
        array3.add(s6);
        ArrayList<Student> array4 = new ArrayList<Student>();
        Student s7 = new Student("李冰冰", 28);
        Student s8 = new Student("张志豪", 29);
        array4.add(s7);
        array4.add(s8);
        xaCzbkMap.put("基础班", array3);
        xaCzbkMap.put("就业班", array4);
        czbkMap.put("西安校区", xaCzbkMap);

        Set<String> czbkset = czbkMap.keySet();
        for (String czbkkey : czbkset) {
            System.out.println(czbkkey);
            HashMap<String,ArrayList<Student>> xxczbk=czbkMap.get(czbkkey);
            Set<String> xxczbkset = xxczbk.keySet();
            for (String xxczbkkey : xxczbkset) {
                System.out.println(xxczbkkey);
                ArrayList<Student> students = xxczbk.get(xxczbkkey);
                for (Student student : students) {
                    System.out.print(student.getName()+"\t"+student.getAge()+"\t");
                }
            }
        }
    }
}
