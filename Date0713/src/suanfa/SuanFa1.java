package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuanFa1 {
    public static void main  (String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int count=Integer.parseInt(br.readLine());
//        System.out.println(count);
        String[] strs=br.readLine().split(" ");
        for (String str : strs) {
            System.out.println(Integer.parseInt(str));
        }
    }
}
