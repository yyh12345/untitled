package controll;

import DAO.UserDAO;
import Utils.DBUtil;
import user.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAOImpl implements UserDAO{

    ArrayList<User> arrayList=new ArrayList<User>();
    @Override
    public boolean addUser(User user) {
        String sql= "insert into User values(?,?,?,?,?,?)";
        Connection conn =null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{
            conn=DBUtil.getConnection();
            ps=conn.prepareStatement(sql);
            ps.setString(1,user.getId());
            ps.setInt(2,user.getGrade());
            ps.setString(3,user.getPassword());
            ps.setDate(4,new java.sql.Date(user.getTime().getTime()));
            ps.setString(5,user.getName());
            ps.setString(6,String.valueOf(sqlTypeConversion.BooleanToString(user.getStatus())));
            final int i = ps.executeUpdate();
            DBUtil.release(conn,ps,rs);
            return true;
        }catch (SQLException e){
            return false;
        }
    }
    @Override
    public boolean deleteUser(String user_id) {
        String sql="delete *from User where  User_Id=?";
        return false;
    }
    @Override
    public ArrayList<User> selectUser() {
        return null;
    }
    public static void main(String[] args){
        User  user=new User("2018101002",2,"123456","分析员",false);
    }


}
