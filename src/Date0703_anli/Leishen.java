package Date0703_anli;
import java.util.Scanner;
public class Leishen {
    public Leishen(){}

    public static void addsalary(Worker worker1){
        if(worker1.getWorkingtime()>1 & worker1.getWorkingtime()<5)
        {
            for(int i=0;i<worker1.getWorkingtime();i++)
            {
                worker1.setSalary(worker1.getSalary()*1.1);
            }

        }
        else if(worker1.getWorkingtime()>5)
        {
            for(int i=0;i<5;i++)
            {
                worker1.setSalary(worker1.getSalary()*1.1);
            }
            Scanner sc=new Scanner(System.in);

            System.out.println("请输入给"+worker1.getName()+"加薪的数目，不超过"+worker1.getSalary()*0.5);
            double addnum=sc.nextDouble();
            if(addnum>worker1.getSalary()*0.5)
            {

                worker1.setSalary(worker1.getSalary()*1.5);
            }
            else
            {
                worker1.setSalary(worker1.getSalary()+addnum);
            }
        }
    }
}
