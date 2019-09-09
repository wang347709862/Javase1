package Date0628;

//25行有错
public class User {
//    public User(String name,String accountNum,String Password){
//        this.name=name;
//        acc.setBelonger(name);
//        acc.setaccountNum(accountNum);
//        acc.setPassword(Password);
//    }
    public User(String name){//只有名字为参数的构造函数
        this.name=name;

    }
    private String name;
    public Account acc;//用户的账户

    public void shuruAccountnum(String accountNum){
        acc.setaccountNum(accountNum);
    }
    public void shuruPassword(String password){
        acc.setpassword(password);
    }
    public void cun(double money){
//这行有错        acc.;
    }
//    public void zhuce(){
//
//    }



}
