package controll;

import DAO.UserDAO;

import java.sql.SQLException;

public class UserDAOImpl implements UserDAO{


    @Override
    public boolean isLand(String id, String password) throws SQLException{//true����¼�ɹ�����
                      if(GetData.getUserinfo().get(0).equals(id)&&GetData.getUserinfo().get(1).equals(password)) {
                              return true;
                      }
                      return  false;
        }
    @Override
    public int getGrade(String id) throws SQLException{
       if (id.substring(4,5).equals("1")){
           return 1;//����Ա
       }else if(id.substring(4,5).equals("2")){
           return 2;//����Ա
       }else if(id.substring(4,5).equals("3")){
           return 3;//�鿴Ա
       }
        return -1;//���û�������
    }


}
