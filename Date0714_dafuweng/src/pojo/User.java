package pojo;

public class User {
    private String name;
    private int number;
    private int password;

    public User() {
    }
    public User(String name, int number, int password) {
        this.name = name;
        this.number = number;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", password=" + password +
                '}';
    }
}
