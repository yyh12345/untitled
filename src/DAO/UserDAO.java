package DAO;

import java.sql.SQLException;

public interface UserDAO {
    public boolean isLand(String id,String password) throws SQLException;
    //�����˺ź������ж��Ƿ��½�ɹ�
    public  int getGrade(String id) throws SQLException;
    //�����û��˺Ż�ȡ�û��ȼ�
//    public void addUser(String facname,int grade);
    //    //����û���Ϣ
    ////    public void modifyUser(String facname,int grade);
    //    //�޸��û���Ϣ
//    public void deleteUser(String facname,int grade);
    //ɾ���û���Ϣ

}
