package model;

import java.sql.Date;

public class Orderinfo {
    private String did;                            ///主键	款号
    private Date online;                         //  主键  上线时间
    private int  quantity;                        //生产数量
    private  double iE_Price;                //IE工价
    private double   facdirector;	      //	厂长确认系数
    private double  cdirector;	              //	客户系数
    private double strdirector	;         //	数量结构系数
    private double teamnumber;     //	小组人数
    private Date offline;                       //下线时间
    private  double days;                    //	生产天数
    private double partime;	            //分析时间
    private double  videotime;         //视频时间

    public Orderinfo() {
    }

    public String getDid() {
        return did;
    }

    public Orderinfo setDid(String did) {
        this.did = did;
        return this;
    }

    public Date getOnline() {
        return online;
    }

    public Orderinfo setOnline(Date online) {
        this.online = online;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public Orderinfo setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public double getiE_Price() {
        return iE_Price;
    }

    public Orderinfo setiE_Price(double iE_Price) {
        this.iE_Price = iE_Price;
        return this;
    }

    public double getFacdirector() {
        return facdirector;
    }

    public Orderinfo setFacdirector(double facdirector) {
        this.facdirector = facdirector;
        return this;
    }

    public double getCdirector() {
        return cdirector;
    }

    public Orderinfo setCdirector(double cdirector) {
        this.cdirector = cdirector;
        return this;
    }

    public double getStrdirector() {
        return strdirector;
    }

    public Orderinfo setStrdirector(double strdirector) {
        this.strdirector = strdirector;
        return this;
    }

    public double getTeam_Number() {
        return teamnumber;
    }

    public Orderinfo setTeam_Number(double teamnumber) {
        teamnumber = teamnumber;
        return this;
    }

    public Date getOffline() {
        return offline;
    }

    public Orderinfo setOffline(Date offline) {
        offline = offline;
        return this;
    }

    public double getDays() {
        return days;
    }

    public Orderinfo setDays(double days) {
        days = days;
        return this;
    }

    public double getPartime() {
        return partime;
    }

    public Orderinfo setPartime(double partime) {
        this.partime = partime;
        return this;
    }

    public double getVideo_time() {
        return videotime;
    }

    public Orderinfo setVideo_time(double video_time) {
        videotime = video_time;
        return this;
    }
}
