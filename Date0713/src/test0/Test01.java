package test0;

import java.io.*;

public class Test01 {
    public static void main(String[] args) {
        OutputStreamWriter osw = null;
        try {
            osw = new OutputStreamWriter(new FileOutputStream("f:\\aaa.txt",true),"UTF-8");
            osw.write("林青霞");
            osw.flush();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//            try {
//                osw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
        }
    }
}
