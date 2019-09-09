package dao;

import pojo.User;

import java.io.*;

public class UserDaoImpl implements UserDao{

    private static File file=new File("f:\\test02\\user.txt");
    static{
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("创建文件失败");
        }
    }

    @Override
    public boolean isLogin(String username, String password) {
        boolean flag=false;
        BufferedReader br=null;
        try {
            br=new BufferedReader(new FileReader(file));
            String line=null;
            while((line=br.readLine())!=null){
                String[] datas=line.split("=");
                if(datas[0].equals(username) && datas[1].equals(password)){
                    flag=true;
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("找不到用户信息的文件！");
        } catch (IOException e) {
            System.out.println("用户登录失败！");
        }finally{
            if(br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println("用户登录释放资源失败！");
                }
            }
        }
        return flag;
    }

    @Override
    public void regist(User user) {
        BufferedWriter bw=null;
        try {
            bw=new BufferedWriter(new FileWriter(file,true));
            bw.write(user.getUsername()+"="+user.getPassword());
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            System.out.println("注册失败，请稍后重试！");
        }finally{
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    System.out.println("用户注册释放资源失败");
                }
            }
        }

    }
}
