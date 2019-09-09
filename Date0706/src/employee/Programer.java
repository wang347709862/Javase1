package employee;

public class Programer extends Employee {
    public Programer() {
    }

    public Programer(String name, String id, int salary) {
//        super(name, id, salary);
//        this.name=
    }

    @Override
    public String toString() {
        return "Programer{"+ "name='" + this.getName() + '\'' +
                ", id='" + this.getId() + '\'' +
                ", salary=" + this.getSalary() +
                '}';
    }

    @Override
    public void work() {
        System.out.println("按照需求写代码");
    }
}
