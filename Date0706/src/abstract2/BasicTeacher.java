package abstract2;

public class BasicTeacher extends Teacher {

    public BasicTeacher() {
    }

    public BasicTeacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("教基础知识");
    }
}
