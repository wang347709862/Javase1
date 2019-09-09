package test01;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test04 {
    public static void main(String[] args) {
        ComboPooledDataSource cpds=new ComboPooledDataSource();
        try {
            cpds.getConnection();
            Connection cn=cpds.getConnection();
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
