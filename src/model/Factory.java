package model;

public class Factory {
    private String facid;               //工厂编号
    private String facname;         //工厂名称
    private  int faccount;        //生产班组组数

    //Factory_Id	Varchar(10)	Not Null	主键	工厂编号
    //Factory_Name	Varchar(25)	Not Null	无	工厂名称
    //Factory_TeamCount	Smallint(3)	Not Null	无	生产班组组数

    public Factory() {
    }

    public Factory(String facid, String facname, int faccount) {
        this.facid = facid;
        this.facname = facname;
        this.faccount = faccount;
    }

    public String getFacid() {
        return facid;
    }

    public Factory setFacid(String facid) {
        this.facid = facid;
        return this;
    }

    public String getFacname() {
        return facname;
    }

    public Factory setFacname(String facname) {
        this.facname = facname;
        return this;
    }

    public int getFaccount() {
        return faccount;
    }

    public Factory setFaccount(int faccount) {
        this.faccount = faccount;
        return this;
    }
}
