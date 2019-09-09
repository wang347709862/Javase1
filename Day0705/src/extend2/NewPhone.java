package extend2;

public class NewPhone extends Phone{
    @Override
    public void call(String name) {
        super.call(name);
        System.out.println("可以听天气预报了");
    }
}
