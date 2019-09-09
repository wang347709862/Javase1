package array;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
//        int[] a={65,6,8,123,54,5,4,8,3};

        int[] arr = null;
//        selectSort(arr);
//        System.out.println(Arrays.binarySearch(arr,57));
//        StringBuilder sb=new StringBuilder("xdasdas");
//        sb.delete(0,1);
        System.out.println(Arrays.toString(arr));
//        for (int i : a) {
//            System.out.print(i+"\t");
//        }
//        System.out.println(erfen(a,6));
//        int[] arr = { 24, 69, 80, 57, 13 };
//
        // public static String toString(int[] a) 把数组转成字符串
//        System.out.println("排序前：" + Arrays.toString(arr));
    }

    public static int erfen(int[] a, int num) {//已排序的二分查找
        int minIndex = 0;
        int maxIndex = a.length - 1;//最大最小的索引
        int nowIndex = (maxIndex + minIndex) / 2;
        while (a[nowIndex] != num) {

            if (a[nowIndex] > num) {
                maxIndex = nowIndex;
            } else {
                minIndex = nowIndex;
            }
            if (minIndex > maxIndex) {
                return -1;
            }
            nowIndex = (maxIndex + minIndex) / 2;
        }
        return nowIndex;
    }

    public static void selectSort(int[] a) {//选择排序
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
