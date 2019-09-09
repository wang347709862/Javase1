package test01;

import com.mchange.v2.c3p0.ComboPooledDataSource;
//import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test05 {
    public static void main(String[] args) {
        ComboPooledDataSource cpds=new ComboPooledDataSource();
//        BasicDataSource bds=new BasicDataSource();
//        bds.setDriverClassName("com.mysql.jdbc.Driver");
//        bds.setUrl("jdbc:mysql://localhost/school");
//        bds.setUsername("root");
//        bds.setPassword("123456");
        Connection cn=null;
        try {

            cn = cpds.getConnection();
            cn.setAutoCommit(false);
            String s="insert into Course values (?,?,?)";
            PreparedStatement ps = cn.prepareStatement(s);
            ps.setInt(1,5);
            ps.setString(2,"化学");
            ps.setInt(3,1);
            ps.executeUpdate();
//            Connection cn=cpds.getConnection();
//            String s="select * from course where cname = ?";

            QueryRunner qr=new QueryRunner(cpds);
//            qr.e
//            qr.update("insert into course values(4,'英语',2)");
//            Course c=qr.query("select * from Course where cname = ?",new BeanHandler<Course>(Course.class),"生物");

//            System.out.println(c);
        } catch (SQLException e) {

//            e.printStackTrace();
        }finally{
            try {
                cn.commit();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
