package string1;

public class StringDemo {
    public static void main(String[] args) {
        String s="helloworld";
//        System.out.println(s.length());
//        System.out.println("charAt:"+s.charAt(7));
//        System.out.println("-----------");
//        System.out.println("indexof"+s.indexOf('l'));
//        System.out.println("-----------");
//        System.out.println("indexof"+s.indexOf("owo"));
//        System.out.println("+-----------");
//        System.out.println("indexof"+s.indexOf('l',4));
//        System.out.println("indexof"+s.indexOf('k',4));
//        System.out.println("indexof"+s.indexOf('l',40));
//        System.out.println("-----------");
//        System.out.println("indexof"+s.indexOf("owo",1));
//        System.out.println("indexof"+s.indexOf("owo",10));
//        System.out.println("------------");
//        System.out.println("substring:"+s.substring(5));
//        System.out.println("substring:"+s.substring(5,7));
        for(int i=0;i<s.length();i++)
        {
            System.out.print(s.charAt(i)+"\t");
        }
    }
}
