package test01;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test03 {
    public static void main(String[] args) {
        BasicDataSource bds=new BasicDataSource();
        bds.setDriverClassName("com.mysql.jdbc.Driver");
        bds.setUrl("jdbc:mysql://localhost/school");
        bds.setUsername("root");
        bds.setPassword("123456");
        try {

            Connection cn=bds.getConnection();
            String s="select * from course where cname = ?";
            PreparedStatement ps = cn.prepareStatement(s);
            ps.setString(1,"生物");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getInt(1)+"----"+rs.getString(2)+"----"+rs.getInt(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
