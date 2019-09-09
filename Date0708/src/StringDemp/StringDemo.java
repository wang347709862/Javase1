package StringDemp;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = new String();
//        System.out.println("s1:" + s1);
//        System.out.println("s1.length:" + s1.length());
        byte[] bys={97,98,99,100,101};
        String s2=new String(bys);
//        System.out.println("s2:" + s2);
//        System.out.println("s2.length:" + s2.length());
//        System.out.println(bys[0]+""+bys[1]+""+bys[2]);
//        String s3 = new String(bys, 1, 3);
//        System.out.println("s3:" + s3);
//        System.out.println("s3.length():" + s3.length());
//        System.out.println("--------------------------");
//        char[] chs={'a','b','林'};
//        String s4=new String(chs);
//        System.out.println("s4:" + s4);
//        System.out.println("s4.length():" + s4.length());
//        System.out.println("--------------------------");
//        String s=new String("abc");
//        String s20="abc";
//        System.out.println(s==s20);
//        String a="abcdef";
        String b="abc";
        String c="def";
        System.out.println("abcdef"==b+c);
        System.out.println("abc"+"def"=="abcdef");
    }
}
