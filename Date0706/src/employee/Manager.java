package employee;

public class Manager extends Employee {
    private int bonus;


    public Manager(String name, String id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("跟客户谈需求");
    }

    public int getBonus() {
        return bonus;
    }
    @Override
    public String toString() {
        return "Manager{"+ "name='" + this.getName() + '\'' +
                ", id='" + this.getId() + '\'' +
                ", salary=" + this.getSalary() +
                ",bonus="+bonus+
                '}';
    }
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
