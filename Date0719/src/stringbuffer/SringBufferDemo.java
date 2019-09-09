package stringbuffer;

public class SringBufferDemo {
    public static void main(String[] args) {
        String a="abcd";
        StringBuffer sb = new StringBuffer(a);
        a=sb.reverse().toString();
//        sb.append("hello");
//        sb.append("world");
//        sb.append("java");
//        sb.replace(5,10,"节日快乐");
//        sb.append("hello").append(true).append(12).append(34.56);
//        sb.insert(5, "world");
        System.out.println("sb:" + a);
//        System.out.println(sb);
//        System.out.println("sb:" + sb);
//        System.out.println("sb.capacity():" + sb.capacity());
//        System.out.println("sb.length():" + sb.length());
//        System.out.println("--------------------------");
//        StringBuffer sb2 = new StringBuffer(50);
//        System.out.println("sb2:" + sb2);
//        System.out.println("sb2.capacity():" + sb2.capacity());
//        System.out.println("sb2.length():" + sb2.length());
//        System.out.println("--------------------------");
//
//        // public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
//        StringBuffer sb3 = new StringBuffer("");
//        System.out.println("sb3:" + sb3);
//        System.out.println("sb3.capacity():" + sb3.capacity());
//        System.out.println("sb3.length():" + sb3.length());
    }
}
