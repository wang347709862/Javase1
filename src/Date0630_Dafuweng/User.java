package Date0630_Dafuweng;

public class User {
    //构造
    User(){}
    User(String name,String number,String password){
        this.name=name;
        this.number=number;
        this.password=password;
    }

    //变量
    private String name;
    private String number;
    private String password;



    //get & set
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
}
