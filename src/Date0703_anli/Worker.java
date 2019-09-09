package Date0703_anli;

public class Worker {
    Worker(){}
    Worker(String name,int workingtime,double salary){
        this.name=name;
        this.workingtime=workingtime;
        this.salary=salary;
    }

    private String name;
    private int workingtime;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingtime() {
        return workingtime;
    }

    public void setWorkingtime(int workingtime) {
        this.workingtime = workingtime;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
