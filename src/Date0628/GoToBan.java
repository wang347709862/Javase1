package Date0628;

public class GoToBan {
    static{
        //初始化信息
        //银行所有账户信息

    }
    public static void main(String[] args){

//        Account account1=new Account();//创建一个账户
        Ban ban1=new Ban();//创建一个银行
        //这个银行添加了三个用户
        ban1.addAccount("蝎子莱莱","wang3477098620","LUOLUOjuanjuan0");
        ban1.addAccount("车轮滚滚","wang3477098621","LUOLUOjuanjuan1");
        ban1.addAccount("蜻蜓队长","wang3477098622","LUOLUOjuanjuan2");
        User user1=new User("蝎子莱莱");//一个用户
        user1.shuruAccountnum("wang3477098620");//用户输入账户号
        user1.shuruPassword("LUOLUOjuanjuan0");//用户输入密码
        ban1.checkAccount(user1);//银行检查账户是否匹配并提示
//        user1.cun
        //用户存钱
        //用户取钱
        //用户转账
    }
}
