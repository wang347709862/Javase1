package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SuanFa4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] a=br.readLine().split(" ");
        int k=Integer.parseInt(a[0]);
        int n=Integer.parseInt(a[1]);
        int[] num=new int[n*n];

        for(int i=0;i<n;i++){
            String[] numStr=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                num[n*i+j]=Integer.parseInt(numStr[j]);
            }
        }
//        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(num[k-1]);
    }
}
