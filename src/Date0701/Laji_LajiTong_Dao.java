package Date0701;

import java.util.Scanner;

public class Laji_LajiTong_Dao {
    public static void createLaji(Laji[][] allLaji){//初始化垃圾并存入数组用来做对比
//        allLaji=new Laji[4][4];

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
    }
    public static void createLajiTong(Lajitong[] allLajitong){//初始化垃圾桶并存入数组
        allLajitong=new Lajitong[4];

        Lajitong lajitong1=new Lajitong();
        lajitong1.name="干垃圾桶";
        allLajitong[0]=lajitong1;

        lajitong1.name="湿垃圾桶";
        allLajitong[1]=lajitong1;

        lajitong1.name="可回收垃圾桶";
        allLajitong[2]=lajitong1;

        lajitong1.name="有害垃圾桶";
        allLajitong[3]=lajitong1;
    }
}
