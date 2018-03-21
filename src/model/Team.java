package model;

public class Team {
    private String tname;           //生产班组小组名称
    private String tfacid;              //所在工厂编号
    private int tnumber;                //生产班组人数

    //Team_Name	Varchar(25)	Not Null	主键	生产班组小组名称
    //Team_FactoryId	Varchar(10)	Not Null	外键	所在工厂编号
    //Team_Number	Smallint(6)	Not Null	无	人数

    public Team() {
    }

    public Team(String tname, String tfacid, int tnumber) {
        this.tname = tname;
        this.tfacid = tfacid;
        this.tnumber = tnumber;
    }

    public String getTname() {
        return tname;
    }

    public Team setTname(String tname) {
        this.tname = tname;
        return this;
    }

    public String getTfacid() {
        return tfacid;
    }

    public Team setTfacid(String tfacid) {
        this.tfacid = tfacid;
        return this;
    }

    public int getTnumber() {
        return tnumber;
    }

    public Team setTnumber(int tnumber) {
        this.tnumber = tnumber;
        return this;
    }
}
