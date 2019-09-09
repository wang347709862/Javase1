package Date0704;

public class Test_Integer {
    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(100));//二进制
//        System.out.println(Integer.toOctalString(100));//八进制
//        System.out.println(Integer.toHexString(100));//十六进制
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        int i=100;
//        Integer i1=new Integer(i);
//        System.out.println("i1"+i1);
//
//        String s="100";
//        Integer i2=new Integer(s);
//        System.out.println("i2"+i2);
//        int number=100;
//        String s1=""+number;
//        String s2=String.valueOf(number);
//        Integer i=new Integer(number);
//        String s3=i.toString();
//        String s4=Integer.toString(number);
//        System.out.println("-------------------");
//
//        String s="100";
//        int num1=Integer.parseInt(s);
//        int num2=new Integer(s).intValue();
//
//        System.out.println(Integer.toString(num1,3));//十进制转换成别的进制
//        System.out.println(Integer.parseInt(s,3));//反过来
//        In
//        Integer i1=127;
//        Integer i2=127;
//        System.out.println(i1==i2);
//        System.out.println(i1.equals(i2));
//        Integer i3 = new Integer(128);
//        Integer i4 = new Integer(128);
//        System.out.println(i3 == i4);
//        System.out.println(i3.equals(i4));
//        System.out.println("-----------");
//        Integer i5 = 128;
//        Integer i6 = 128;
//        System.out.println(i5 == i6);
//        System.out.println(i5.equals(i6));
//        System.out.println("-----------");
        int num=100;
        String s="100";

        String s1=Integer.toString(num);
        String s2=""+num;//拼接
        String s3=new Integer(s).toString();
        String s4=String.valueOf(num);//装箱
        int n=new Integer("100").intValue();
        String st=String.valueOf(n);

        int n1=Integer.parseInt(s);
        int n2=Integer.valueOf(s);//装箱

        Integer nx=new Integer(n1);
//        nx.equals()





    }
}
