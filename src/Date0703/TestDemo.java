package Date0703;
import java.util.Scanner;
public class TestDemo {
    public static void main(String[] args) {
        City[] city12=new City[12];
        Scanner sc=new Scanner(System.in);
        String name;
        for(int i=0;i<12;i++)
        {
            System.out.println("设定第"+(i+1)+"个城市的名字是：");
            name=sc.next();
            city12[i]=new City();
            city12[i].setName(name);;
        }
//        try {
//            Thread.sleep(2000); //等待2秒.
//        } catch(InterruptedException ex) {
//            Thread.currentThread().interrupt();
//        }
        System.out.println("开始展示所有城市");
//        try {
//            Thread.sleep(2000); //等待2秒.
//        } catch(InterruptedException ex) {
//            Thread.currentThread().interrupt();
//        }
        for(int i=0;i<12;i++)
        {
            System.out.println("第"+(i+1)+"个城市的名字是："+city12[i].getName());
        }
    }
}
