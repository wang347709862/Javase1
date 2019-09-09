package fileinputstream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s="你好";
        byte[] bys=s.getBytes("GBK");
//        System.out.println(Arrays.toString(bys));

        String ss=new String(bys,"UTF-8");
        System.out.println(ss);
    }
}
