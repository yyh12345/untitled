package controll;

import DAO.UserDAO;

import java.sql.SQLException;

public class UserDAOImpl implements UserDAO{


    @Override
    public boolean isLand(String id, String password) throws SQLException{//true：登录成功‘’
                      if(GetData.getUserinfo().get(0).equals(id)&&GetData.getUserinfo().get(1).equals(password)) {
                              return true;
                      }
                      return  false;
        }
    @Override
    public int getGrade(String id) throws SQLException{
       if (id.substring(4,5).equals("1")){
           return 1;//管理员
       }else if(id.substring(4,5).equals("2")){
           return 2;//分析员
       }else if(id.substring(4,5).equals("3")){
           return 3;//查看员
       }
        return -1;//该用户不存在
    }


}
