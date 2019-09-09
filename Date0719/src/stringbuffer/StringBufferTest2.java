package stringbuffer;

public class StringBufferTest2 {
    public static void main(String[] args) {
        int[] arr = { 44, 33, 55, 11, 22 };
        System.out.println(arrayToArray(arr));
        StringBuilder sb=new StringBuilder("dasd");
        sb.append(true);
        System.out.println(sb);
    }

    public static String arrayToArray(int[] a) {
        StringBuffer sbf=new StringBuffer();
        for (int i : a) {
            sbf.append(i);
        }
        String str=sbf.toString();
        return str;
    }
}
