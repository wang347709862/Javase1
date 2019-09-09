package Date0701;

import java.util.Scanner;

public class TestClass {




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //初始化人
        Worker worker1=new Worker("张老师",true,true);
        Somebody somebody1=new Somebody("某同学",true,false);
        Laji[][] allLaji=new Laji[4][4];//null空指针
        Laji_LajiTong_Dao.createLaji(allLaji);//初始化16个垃圾对象并存人数组allLaji
        System.out.println(allLaji[0][0]);
//        Lajitong[] allLajitong=null;
//        Laji_LajiTong_Dao.createLajiTong(allLajitong);//创建四个垃圾桶对象并存入数组allLajitong

        //初始化场景

        System.out.println(worker1.getName()+":你是什么垃圾？");
        System.out.println(somebody1.getName()+":我不知道我是什么垃圾，你帮我分一下被？");
        System.out.println(worker1.getName()+":一个一个拿来你的垃圾，别超过十个。");
        for(int i=0;i<10;i++)
        {
            System.out.println("请拿来第"+(i+1)+"个垃圾");
            String a=sc.next();
            for(int j=0;j<allLaji.length;j++)
            {
                for(int k=0;k<allLaji[j].length;k++)
                {
                    if(allLaji[j][k].name.equals(a))
                    {
                        if(j==0)//
                        {
                            System.out.println("这是干垃圾");
                        }
                        else if(j==1)//
                        {
                            System.out.println("这是湿垃圾");
                        }
                        else if(j==2)//
                        {
                            System.out.println("这是可回收垃圾");
                        }
                        else if(j==3)//
                        {
                            System.out.println("这是有害垃圾");
                        }
                    }
                }
            }

        }


    }
}
