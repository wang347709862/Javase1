package com.itdr.demo1;

import java.sql.*;

public class Test01 {
    public static void main(String[] args) {
        Statement statement =null;
        Connection con =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/school","root", "123456");//建立连接
//           statement = con.createStatement();//创建对象

//            ResultSet resultSet=statement.executeQuery("select * from score");//获取结果
            //插入
            String course="英语";
            int teach_id=3;
//            String sql1="insert into course values(null,'"+course+"',"+teach_id+")";
//            statement.executeUpdate(sql1);

//            String sql2="delete from course where cname ='"+course+"'";
            PreparedStatement ps=con.prepareStatement("select * from course where cname = ?");
            ps.setString(1,"物理");
            ResultSet resultSet1 = ps.executeQuery();
            while(resultSet1.next()){
                System.out.println(resultSet1.getInt(1)+"--"
                        +resultSet1.getString(2)+"--"
                        +resultSet1.getInt(3)+"--");
            }
//            String sql2="delete from course where course ='英语'";
//            statement.executeUpdate(sql2);
//            while(resultSet.next()){
//                System.out.println(resultSet.getInt(1)+"--"
//                        +resultSet.getInt(2)+"--"
//                        +resultSet.getInt(3)+"--"+
//                        resultSet.getInt(4));
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{

            try {
//                statement.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
