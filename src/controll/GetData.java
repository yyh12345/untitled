package controll;

import DBUtils.DBUtil;
import user.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class GetData {
    public static  List<String>  getUserinfo() throws SQLException {
        Connection conn ;
        conn = DBUtil.getConnection();
        String sql = "select User_Id,Passsword  from user where  User_Grade = ?";
        User user = new User(1);
        PreparedStatement ps =
                conn.prepareStatement(sql);
        ps.setInt(1, user.getGrade());
        ResultSet rs = ps.executeQuery();
        String userid = null;
        String passsword = null;
        List<String>  list = new ArrayList<String>();
        while (rs.next()) {
             userid = rs.getString("User_Id");
             passsword = rs.getString("Passsword");
             list.add(userid);
             list.add(passsword);
        }
        DBUtil.release(conn,ps,rs);
        return list;

    }

    public static int geCurrentYear(){
        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        return year;
    }
}
