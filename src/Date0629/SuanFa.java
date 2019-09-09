package Date0629;
import java.util.Scanner;
public class SuanFa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int place=sc.nextInt();
        int count=0;
        for(int i=5;i>=2;i--)
        {
            count+=place/i;
            place%=i;
        }
        System.out.println(count+place);
    }
}
