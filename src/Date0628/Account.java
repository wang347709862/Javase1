package Date0628;

public class Account {
    private String belonger;
    private String accountNum;
    private String password;
    private double yuE;//余额
    public Account(String belonger,String accountNum,String password){
        this.belonger=belonger;
        this.accountNum=accountNum;
        this.password=password;

    }
    public String getBelonger() {
        return belonger;
    }

    public void setBelonger(String belonger) {
        this.belonger = belonger;
    }

    public String getaccountNum() {
        return accountNum;
    }

    public void setaccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public String getpassword() {
        return password;
    }

    public void setpassword(String password) {
        this.password = password;
    }

    public double getYuE() {
        return yuE;
    }

    public void setYuE(double yuE) {
        this.yuE = yuE;
    }
}
