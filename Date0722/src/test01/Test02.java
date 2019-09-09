package test01;

import java.sql.*;
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        //连接池
        ArrayList<Connection> list=new ArrayList<>();
        Connection cn=null;
        for(int i=0;i<5;i++){
                cn=DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/school","root", "123456");
                list.add(cn);
        }
        System.out.println(list.size());
        //获取一个连接
        Connection c=list.remove(0);
        System.out.println(list.size());

        PreparedStatement ps = c.prepareStatement("select * from course where cname = ?");
        ps.setString(1,"生物");
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
//            System.out.println("cid------cname------teach_id");
            System.out.println(rs.getInt(1)+"----"+rs.getString("cname")+rs.getString("cname")+"----"+rs.getInt(3));
        }
        //还回连接
        list.add(c);
        System.out.println(list.size());
    }
}
