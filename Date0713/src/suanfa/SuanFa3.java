package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class SuanFa3 {
//    给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第k小的元素。
//    请注意，它是排序后的第k小元素，而不是第k个元素。
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = br.read() - 48;
        br.read();
        int n = br.read() - 48;
        int[][] numbers = new int[n][n];
        int count = n;
        int i=0;
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        while (count > 0) {//将每一行转换为int并存入数组中
            String[] numbersStr = br2.readLine().split(" ");
                for (int j = 0; j < n; j++) {
                    numbers[i][j] = Integer.parseInt(numbersStr[j]);
                }
            i++;
            count--;
        }

        HashSet<Integer> set=new HashSet();
        set.add(numbers[0][0]);
        for(int x=1;x<k;x++)
        {
//            if(){
//                remove
//            }
//            set.add(numbers)
        }
    }
    public static void min(Set set){

    }
}
