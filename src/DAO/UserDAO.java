package DAO;

import java.sql.SQLException;

public interface UserDAO {
    public boolean isLand(String id,String password) throws SQLException;
    //根据账号和密码判断是否登陆成功
    public  int getGrade(String id) throws SQLException;
    //根据用户账号获取用户等级
//    public void addUser(String facname,int grade);
    //    //添加用户信息
    ////    public void modifyUser(String facname,int grade);
    //    //修改用户信息
//    public void deleteUser(String facname,int grade);
    //删除用户信息

}
