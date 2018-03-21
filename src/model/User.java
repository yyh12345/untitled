package user;

import sun.security.util.Password;

import java.sql.Time;
import java.util.Date;

public class User {
    private String id ;                     //�˺�
    private int grade;                    //Ȩ�޵ȼ�
    private String password;        //����
    private Date time;                  //ע��ʱ��
    private String name;              //�ǳ�
    private String status;              //��¼״̬

//    User_Id	varchar(10)	Not null	����	�˺�
//    User_Grade	tinyint(3)	Not null	���	Ȩ�޵ȼ�
//    Password varchar(16)	Not null	��	����
//    Time datetime	Not null	��	ע��ʱ��
//    User_Name	varchar(10)	Null	��	�ǳ�
//    User_Status	varchar(10)	Not null	��	��¼״̬


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
