package user;

public class UserType {
    private int grade;             //Ȩ�޵ȼ�
    private String  classify;       //Ȩ�޷���

    //Grade	tinyint(3)	Not null	����	Ȩ�޵ȼ�
    //Classify	varchar(10)	Not null	��	Ȩ�޷���

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
