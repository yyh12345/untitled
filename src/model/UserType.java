package user;

public class UserType {
    private int grade;             //权限等级
    private String  classify;       //权限分类

    //Grade	tinyint(3)	Not null	主键	权限等级
    //Classify	varchar(10)	Not null	无	权限分类

    public UserType() {
    }

    public UserType(int grade, String classify) {
        this.grade = grade;
        this.classify = classify;
    }

    public int getGrade() {
        return grade;
    }

    public UserType setGrade(short grade) {
        this.grade = grade;
        return this;
    }

    public String getClassify() {
        return classify;
    }

    public UserType setClassify(String classify) {
        this.classify = classify;
        return this;
    }
}
