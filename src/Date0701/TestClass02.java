package Date0701;
import java.util.Scanner;
public class TestClass02 {
    public static void main(String[] args) {
        Laji[][] allLaji=new Laji[4][4];

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            if(i==0){
                System.out.println("请输入四种干垃圾");
            }
            else if(i==1){
                System.out.println("请输入四种湿垃圾");
            }
            else if(i==2){
                System.out.println("请输入四种可回收垃圾");
            }
            else if(i==3){
                System.out.println("请输入四种有害垃圾");
            }

            for(int j=0;j<4;j++)
            {
                String la=sc.next();
                Laji lj=null;
                if(i==0)
                {
                    lj=new GanLaji();
                }
                else if(i==1)
                {
                    lj=new ShiLaji();
                }
                else if(i==2)
                {
                    lj=new KehuishouLaji();
                }
                else if(i==3)
                {
                    lj=new DamageLaji();
                }
                lj.name=la;
                allLaji[i][j]=lj;
            }
        }
        for(int j=0;j<4;j++)
        {
            for(int k=0;k<4;k++)
            {
                System.out.println(allLaji[j][k].name);
            }
        }

    }
}
