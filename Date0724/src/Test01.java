import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        String dixivStr=br.readLine();
//        int dixiv=Integer.parseInt(dixivStr);
//        int[][] nums=new int[dixiv][dixiv];
//
//        int i=0;
//        String line=null;
//        while((line=br.readLine())!=null && i<dixiv){//存入数组
//            String[] strs=line.split(" ");
//            for(int j=0;j<dixiv;j++){
//                nums[i][j]=Integer.parseInt(strs[j]);
//            }
//            i++;
//
//        }
//        int[] a;
//        a[0]=0;
        Integer a=new Integer(30);
        int b=30;
        System.out.println(a==b);
        String c="a";
        c.hashCode();

    }
}
