package changyongl;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        int year=2020;
        Calendar rightnow=Calendar.getInstance();
        rightnow.set(year,2,1);
        rightnow.add(Calendar.DATE,-1);
        System.out.println(rightnow.get(Calendar.DATE));
//        Calendar rightnow =Calendar.getInstance();
//
//        int month = rightnow.get(Calendar.MONTH);
//        // 获取日
//        int date = rightnow.get(Calendar.DATE);
//        rightnow.add(Calendar.YEAR,1);
//        int year=rightnow.get(Calendar.YEAR);
//        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
    }
}
