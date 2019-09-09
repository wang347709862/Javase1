package Date0620;

import java.util.*;
public class Date0620 {
    public static void main(String[] args){
        int[][] arr2=new int[3][5];
//        arr2[0]={12,23,34,45,56};
//        arr2[1]={12,23,34,45};
//        arr2[2]={12,23,34};不能这样赋值？//这是在给地址赋值
//        lianxi01();
        array2dFuzhi(arr2);
        array2dBianli(arr2);
    }
    public static void array2dBianli(int[][] a){//遍历二维数组并输出
//        int[][] arr={{1,2},{4,5,6},{7,8,9}};
//        erweiBianli(arr);
        for(int x=0;x<a.length;x++){
            for(int y=0;y<a[x].length;y++){
                System.out.print(a[x][y]+"\t");
            }
            System.out.println();
        }
    }
    public static void array2dFuzhi(int[][] a){//从键盘录入每一行给二维数组赋值
//        int[][] arr2=new int[3][];
//        arr2[0]=new int[5];
//        arr2[1]=new int[4];
//        arr2[2]=new int[3];
//        erweifuzhi(arr2);
        for(int x=0;x<a.length;x++){
            Scanner sc=new Scanner(System.in);
//            System.out.println("请输入第"+(x+1)+"行");
            for(int y=0;y<a[x].length;y++){
                a[x][y]=sc.nextInt();
            }
        }
    }
    public static void lianxi01(){
        int[][] a={{60,12,23},{0,50,69},{98,120},{111,222,333}};
        double salary=0;
        for(int x=0;x<a.length;x++)
        {
            for(int y=0;y<a[x].length;y++)
            {
                salary+=a[x][y];
            }
        }
        System.out.printf("销售总额是"+salary/10);
    }
    }
