package model;

public class Client {
    private String cid;                     //�ͻ����
    private String cname;               //�ͻ�����
    private String crank;                   //�ͻ�����
    //Client_Id	varchar(20)	Not Null	����	�ͻ����
    //Client_Name	varchar(25)	Not Null	��	�ͻ�����
    //Client_Rank	varchar(2)	Not Null	��	�ͻ�����

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
