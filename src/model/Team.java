package model;

public class Team {
    private String tname;           //��������С������
    private String tfacid;              //���ڹ������
    private int tnumber;                //������������

    //Team_Name	Varchar(25)	Not Null	����	��������С������
    //Team_FactoryId	Varchar(10)	Not Null	���	���ڹ������
    //Team_Number	Smallint(6)	Not Null	��	����

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
