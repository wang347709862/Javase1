import java.util.HashSet;

public class Test02 {
    public static void main(String[] args) {
        String a="abc";
        String b="abc";
        String c=new String("abc");
        String d="def";
        String e="abcdef";
        int g=30;
        Integer h=new Integer(30);

        System.out.println("a==b:"+(a==b));//
        System.out.println("a.hashCode()==b.hashCode():"+(a.hashCode()==b.hashCode()));//
        System.out.println("a==c:"+(a==c));//
        System.out.println("a.hashCode()==c.hashCode():"+(a.hashCode()==c.hashCode()));//

        System.out.println("a+d==e:"+(a+d==e));//
        System.out.println("\"abc\"+\"def\"==e:"+("abc"+"def"==e));//

        System.out.println("g==h:"+(g==h));//

        HashSet<String> hs=new HashSet<>();
        hs.add(a);
        hs.add(b);
        hs.add(c);
        System.out.println(hs);
    }
}
