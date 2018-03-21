package model;

public class Factory {
    private String facid;               //�������
    private String facname;         //��������
    private  int faccount;        //������������

    //Factory_Id	Varchar(10)	Not Null	����	�������
    //Factory_Name	Varchar(25)	Not Null	��	��������
    //Factory_TeamCount	Smallint(3)	Not Null	��	������������

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
