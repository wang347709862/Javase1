package Date0703_anli;

public class TestLeishen {
    public static void main(String[] args) {
        Worker keer=new Worker("keer",3,3000.0);
        Worker dada=new Worker("dada",6,3000.0);
        Leishen.addsalary(keer);
        Leishen.addsalary(dada);
        System.out.println("keer的工资是"+keer.getSalary());
        System.out.println("keer的工资是"+dada.getSalary());
    }


}
