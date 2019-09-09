package finaldemo;

public class String1 {
    public static void main(String[] args) {
        byte[] b={97,98,99,126};
        System.out.println(b[0]);
        String s=new String(b);
        System.out.println(s);
    }
}
