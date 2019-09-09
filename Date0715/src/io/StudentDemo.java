package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts=new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num=s1.getSum()-s2.getSum();
                int num2=num==0 ? s1.getChinese()-s2.getChinese() : num;
                int num3=num2==0 ?s1.getMath() - s2.getMath() : num2;
                int num4 = num3 == 0 ? s1.getEnglish() - s2.getEnglish() : num3;
                int num5 = num4 == 0 ? s1.getName().compareTo(s2.getName()) : num4;
                return num5;
            }
        });

        for(int x=1;x<=5;x++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第"+x+"的学系信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            Student s=new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            ts.add(s);
        }

        BufferedWriter bw=new BufferedWriter(new FileWriter("f:\\students.txt"));
        bw.write("学生信息如下");
        bw.newLine();
        bw.flush();
        bw.write("姓名,语文成绩,数学成绩,英语成绩");
        bw.newLine();
        bw.flush();
        for (Student s : ts) {
            StringBuilder sb=new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",")
                    .append(s.getMath()).append(",").append(s.getEnglish()).append(",");
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
        System.out.println("学生信息存储完毕");
    }
}
