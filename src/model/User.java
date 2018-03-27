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
    private String status;              //登录状态

//    User_Id	varchar(10)	Not null	主键	账号
//    User_Grade	tinyint(3)	Not null	外键	权限等级
//    Password varchar(16)	Not null	无	密码
//    Time datetime	Not null	无	注册时间
//    User_Name	varchar(10)	Null	无	昵称
//    User_Status	varchar(10)	Not null	无	登录状态


    public User() {

    }

    public User(int grade) {
        this.grade = grade;
    }

    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public int getGrade() {
        return grade;
    }

    public User setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Date getTime() {
        return time;
    }

    public User setTime(Date time) {
        this.time = time;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public User setStatus(String status) {
        this.status = status;
        return this;
    }
}
