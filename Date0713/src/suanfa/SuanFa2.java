package suanfa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//幼儿园里有有M个小朋友在课件玩耍，
//        每个人手中现有ni个玩具。为了公平起见，老
//        师需要让每个小朋友手中有相同数量的玩具。假设老师
//        每次只能从一个人手中拿走两个玩具并给另一个小朋友
//        。求老师最少需要做多少次这样的玩具转移。如果不存在
//        可行的方案则输出-1。
public class SuanFa2 {
    public static void main(String[] args) throws IOException {
        //分两行输入
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = br.read() - 48;

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = br2.readLine().split(" ");
        br.close();
        br2.close();
        int[] a = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            a[i] = Integer.parseInt(strs[i]);
            sum = sum + a[i];
        }
        if(sum%2==1)
        {
            System.out.println(-1);
            return;
        }//总数必为偶数

        int avg = sum / num;//平均数，即最终每个人的玩具数
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (Math.abs(avg - a[i]) % 2 != 0) {//某个人的玩具数与平均数之差不是偶数，则不可能分配成功
                System.out.println(-1);
                return;
            }
            if (a[i] - avg >= 0) {//只看比平均数多的人（需要给别人多少个玩具），每多2计数一次，即为需要分配的次数
                count += (a[i] - avg) / 2;
            }
        }
        System.out.println(count);
    }
}
