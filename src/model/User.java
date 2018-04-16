package user;

import sun.security.util.Password;

import java.sql.Time;
import java.util.Date;

public class User {
    private String id ;                     //账号
    private int grade;                    //权限等级
    private String password;        //密码
    private Date time;                  //注册时间
    private String name;              //昵称
    private boolean status;              //登录状态

//    User_Id	varchar(10)	Not null	主键	账号
//    User_Grade	tinyint(3)	Not null	外键	权限等级
//    Password varchar(16)	Not null	无	密码
//    Time datetime	Not null	无	注册时间
//    User_Name	varchar(10)	Null	无	昵称
//    User_Status	varchar(10)	Not null	无	登录状态
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    public User(String id, int grade, String password, String name, boolean status) {
        this.id = id;
        this.grade = grade;
        this.password = password;
        this.name = name;
        this.status = status;
    }
}
