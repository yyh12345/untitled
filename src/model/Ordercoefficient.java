package model;

import java.sql.Date;

public class Ordercoefficient {
    private double did;
    private Date online;
    private double coereality;          //��ϵ��ʵ�ʲ��������
    private double uninyield;           //δ��ϵ�����������
    private double coetarget;           //��ϵ������Ŀ������

    public Ordercoefficient() {
    }

    public double getDid() {
        return did;
    }

    public Ordercoefficient setDid(double did) {
        this.did = did;
        return this;
    }

    public Date getOnline() {
        return online;
    }

    public Ordercoefficient setOnline(Date online) {
        this.online = online;
        return this;
    }

    public double getCoereality() {
        return coereality;
    }

    public Ordercoefficient setCoereality(double coereality) {
        this.coereality = coereality;
        return this;
    }

    public double getUninyield() {
        return uninyield;
    }

    public Ordercoefficient setUninyield(double uninyield) {
        this.uninyield = uninyield;
        return this;
    }

    public double getCoetarget() {
        return coetarget;
    }

    public Ordercoefficient setCoetarget(double coetarget) {
        this.coetarget = coetarget;
        return this;
    }
}
