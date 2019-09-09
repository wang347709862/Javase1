public class test01 {
    public static void main(String[] args) {
        byte[] bys = {97, 98, 99, 100, 101};
        String s2 = new String(bys);
        System.out.println("s2:" + s2);
        System.out.println("s2.length():" + s2.length());//abc 3
    }
}
