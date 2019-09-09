package io;

import java.io.*;

public class CopyDemo {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("f:\\jkl.txt"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("f:\\jkl02.txt"));
//
//        String line = null;
//        while ((line = br.readLine()) != null) {
//            bw.write(line);
////        bw.write("电动蝶阀 更好好");
////            bw.newLine();
//            bw.flush();
//        }
//
//        bw.close();
//        br.close();
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("f:\\精英5名单.png"));

        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("f:\\01.png"));

        int len=0;
        byte[] bys=new byte[1024];
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();

    }
}
