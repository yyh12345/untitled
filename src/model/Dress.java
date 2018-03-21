package model;

public class Dress {
    //Dress_Id	Varchar(25)	Not Null	����	���
    //Style_Detailed	Varchar(25)	Not Null	���	��ʽϸ��
    //Team_Name	Varchar(25)	Not Null	���	��������С������
    //Client_Id	varchar(20)	Not Null	���	�ͻ����
    private String did;                       //���
    private String sdetailed;           //��ʽϸ��
    private String tname;               //��������С������
    private String cid;                     //	�ͻ����

    public Dress() {
    }

    public Dress(String did, String sdetailed, String tname, String cid) {
        this.did = did;
        this.sdetailed = sdetailed;
        this.tname = tname;
        this.cid = cid;
    }

    public String getDid() {
        return did;
    }

    public Dress setDid(String did) {
        this.did = did;
        return this;
    }

    public String getSdetailed() {
        return sdetailed;
    }

    public Dress setSdetailed(String sdetailed) {
        this.sdetailed = sdetailed;
        return this;
    }

    public String getTname() {
        return tname;
    }

    public Dress setTname(String tname) {
        this.tname = tname;
        return this;
    }

    public String getCid() {
        return cid;
    }

    public Dress setCid(String cid) {
        this.cid = cid;
        return this;
    }
}
