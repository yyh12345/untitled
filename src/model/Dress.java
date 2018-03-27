package model;

public class Dress {
    //Dress_Id	Varchar(25)	Not Null	主键	款号
    //Style_Detailed	Varchar(25)	Not Null	外键	款式细分
    //Team_Name	Varchar(25)	Not Null	外键	生产班组小组名称
    //Client_Id	varchar(20)	Not Null	外键	客户编号
    private String did;                       //款号
    private String sdetailed;           //款式细分
    private String tname;               //生产班组小组名称
    private String cid;                     //	客户编号

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
