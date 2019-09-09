package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuanFa5 {
//    、、序列是否可以是非递减序列
    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String[] numStr=br.readLine().split(" ");
//        int length=numStr.length;
//        int[] num=new int[length];
//
//        num[0]=Integer.parseInt(numStr[0]);
//        num[1]=Integer.parseInt(numStr[1]);
//        int count=0;
//        for(int i=2;i<length;i++){
//            num[i]=Integer.parseInt(numStr[i]);
//            if(num[i]<num[i-1]){
//                num[i-1]=num[i-2];
//                count++;
//                i--;//继续判断改变后这一位是否满足条件
//            }
//            if(count==2){
//                System.out.println(0);
//                return;
//            }
//        }
//        System.out.println(1);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String[] str = reader.readLine().split(" ");
        int count = 0;
        for(int i = 0;i < str.length - 1;i++) {
            int b = str[i].compareTo(str[i+1]);
            if(b > 0) {
                count++;
            }
        }
        if(count > 1) {
            System.out.println("0");
        }else {
            System.out.println("1");
        }
    }
}
