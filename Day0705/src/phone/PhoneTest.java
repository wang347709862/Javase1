package phone;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p=new Phone();
        p.show();

        p.setBrand("三星");
        p.setPrice(2999);
        p.setColor("土豪金");
        p.show();

        new Phone("华为",1999,"少女粉").show();
    }
}
