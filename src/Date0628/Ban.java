package Date0628;

public class Ban {
    Account[] allAccount;//所有用户的账户
    Account now=null;
    private int counter=0;


    public void addAccount(String name,String accountNum,String Password){
        now=new Account(name,accountNum,Password);
        allAccount[counter]=now;
        counter++;
    }
    public void checkAccount(User a){
        for(int i=0;i<allAccount.length;i++)
        {
            if(a.acc.getaccountNum()==allAccount[i].getaccountNum()  && a.acc.getpassword()==allAccount[i].getpassword())
            {
                System.out.println("你可以继续操作");
            }
            else{
                System.out.println("账户信息有误");
            }
        }
    }


}
