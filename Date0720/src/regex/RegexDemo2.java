package regex;

public class RegexDemo2 {
    public static void main(String[] args) {
//        String qq ="1566315";
//
//        System.out.println(qq.matches("\\w+@\\w{2,6}(\\.\\w{2,3})+"));
        String s1 = "aa.bb.cc";
        String[] s2=s1.split("\\.");
        System.out.println(s2[0]);
        String s3 = "aa    bb                cc";
        String[] str3Array=s3.split(" +");
        for (int x = 0; x < str3Array.length; x++) {
            System.out.println(str3Array[x]);
        }
        System.out.println("---------------------");
        String s4 = "E:\\JavaSE\\day14\\avi";
        String[] str4Array = s4.split("\\\\");
        for (int x = 0; x < str4Array.length; x++) {
            System.out.println(str4Array[x]);
        }
        System.out.println("---------------------");
    }
}
