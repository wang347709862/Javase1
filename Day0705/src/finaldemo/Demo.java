package finaldemo;

public class Demo {
    int num;
    final int num2;

    {
        //num2 = 10;
    }

    public Demo() {
        num = 100;
        //无法为最终变量num2分配值
        num2 = 200;
    }
}
