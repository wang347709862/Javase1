import java.util.Arrays;
import java.util.HashSet;

public class tomorrow {
    public static void main(String[] args) {
            //第一部分，字符串与地址
        String a="abc";
        String b="abc";
        String c=new String("abc");
        String d="def";
        String e="abcdef";
        int g=30;
        Integer h=new Integer(30);

        System.out.println("a==b:"+(a==b));//
        System.out.println("a.hashCode()==b.hashCode():"+(a.hashCode()==b.hashCode()));//
        System.out.println("a==c:"+(a==c));//
        System.out.println("a.hashCode()==c.hashCode():"+(a.hashCode()==c.hashCode()));//
        System.out.println("a+d==e:"+(a+d==e));//
        System.out.println("\"abc\"+\"def\"==e:"+("abc"+"def"==e));//
        System.out.println("g==h:"+(g==h));//

        HashSet<String> hs=new HashSet<>();
        hs.add(a);
        hs.add(b);
        hs.add(c);
        System.out.println(hs);


        //第二部分，数组与空指针
//        int[] a=new int[5];
//        a[0]=0;
//        System.out.println(a[0]);
//
//        int[] a2=null;
//        a2[0]=0;
//        System.out.println(a2[0]);
//        System.out.println(a2);
//
//        int[] a3;
//        a3[0]=0;
//        System.out.println(a3[0]);
//        System.out.println(Arrays.toString(a3));


        //第三部分，单例模式

//        Chinese obj1 = Chinese.getInstance();
//        Chinese obj2 = Chinese.getInstance();
//        System.out.println(obj1 == obj2);


         //1.
//        String s="abc"是一种非常特殊的形式,和new 有本质的区别。它是java中唯一不需要new 就可以产生对象的途径。
//        以String s="abc";形式赋值在java中叫直接量,它是在常量池中而不是象new一样放在压缩堆中。
//        当声明这样的一个字符串后，JVM会在常量池中先查找有有没有一个值为"abc"的对象,
//        如果有,就会把它赋给当前引用.即原来那个引用和现在这个引用指点向了同一对象,如果没有,则在常量池中新创建一个"abc",
//        下一次如果有String s1 = "abcd";又会将s1指向"abcd"这个对象,即以这形式声明的字符串,只要值相等,任何多个引用都指向同一对象.

        //2.
//        hashset判断元素是否重复，实际调用了.hashCode()和equals()方法，如果两个值相同的字符串hashcode不同，会被判定为不同的集合元素
//        所以String重写了.hashCode()方法使得值相同但地址不同的字符串判定为相同的集合元素

        //3.
//        字符串如果是变量相加，先开空间，在拼接。字符串如果是常量相加，是先加，然后在常量池找，如果有就直接返回，否则，就创建。

        //4.
//        基本型和基本型封装型进行“==”运算符的比较，基本型封装型将会自动拆箱变为基本型后再进行比较

        //5.
//        单例模式：
//        意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
//        主要解决：一个全局使用的类频繁地创建与销毁。
//        何时使用：当您想控制实例数目，节省系统资源的时候。
//        如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
//        关键代码：构造函数是私有的。
//        说明：某一个类将自己的构造方法定义成private，那么外部的程序就不能通过new的方法来实例化这个类的对象，
//        这样是否实例化对象的责任就变成类本身自己的责任，而不是别人（其他程序）的责任。保证一个类仅有一个实例，并且提供一个访问它的全局访问点
//        例：Windows 是多进程多线程的，在操作一个文件的时候，就不可避免地出现多个进程或线程同时操作一个文件的现象，所以所有文件的处理必须通过唯一的实例来进行。
//        参考：https://www.runoob.com/design-pattern/singleton-pattern.html
    }
}

