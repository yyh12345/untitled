import controll.UserDAOImpl;

import java.sql.SQLException;


public class Demo {
    public  static  void main(String[] args)throws SQLException{
//        geCurrentYear();

            test();

    }
//    public static  void geCurrentYear(){
//        Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
//        int year = c.get(Calendar.YEAR);
//        System.out.println(year);
//
//    }
    public static void test () throws SQLException{
        String id = "2018101001";
        String password = "101001";
        UserDAOImpl userDaoImpl = new UserDAOImpl();
        if(userDaoImpl.isLand(id,password)){
            System.out.println("登录成功");//已验证
        }else{
            System.out.println("登录失败");
        }
       ;
//        System.out.println( userDaoImpl.getGrade(id));//以验证为1

    }

}
