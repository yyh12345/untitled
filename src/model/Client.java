package model;

public class Client {
    private String cid;                     //客户编号
    private String cname;               //客户名称
    private String crank;                   //客户级别
    //Client_Id	varchar(20)	Not Null	主键	客户编号
    //Client_Name	varchar(25)	Not Null	无	客户名称
    //Client_Rank	varchar(2)	Not Null	无	客户级别

    public Client() {

    }

    public Client(String cid, String cname, String crank) {
        this.cid = cid;
        this.cname = cname;
        this.crank = crank;
    }

    public String getCid() {
        return cid;
    }

    public Client setCid(String cid) {
        this.cid = cid;
        return this;
    }

    public String getCname() {
        return cname;
    }

    public Client setCname(String cname) {
        this.cname = cname;
        return this;
    }

    public String getCrank() {
        return crank;
    }

    public Client setCrank(String crank) {
        this.crank = crank;
        return this;
    }
}
