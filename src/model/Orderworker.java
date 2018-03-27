package model;

import java.sql.Date;

public class Orderworker {

    private String did;                                 //主键	款号
    private Date online;                             //  主键  上线时间
    private double perdaily;                    //	人均日产量
    private double coefficient;                //	加系数工价
    private double avedaily;	                 //无	平均日产量
    private double  adddaily;                  //	加系数分析日产量
    private double  anadaily;                   	//	分析日产量
    private int pltime;                                  //	无	加系数分析时间
    private int timecons;                           //	实际每款耗时
    private int nocoeanalysis;	            //各款未加系数分析总时间
    private int addcoeanalysis;                 	//各款加系数分析总时间
    private int acproducttime;                      //各款实际生产总时间
    private double timecomrate;	            //时间达成率
    private double totalwages ;             //	合计工资
    private double avesalary;		       //平均工资

    public Orderworker() {

    }

    public String getDid() {
        return did;
    }

    public Orderworker setDid(String did) {
        this.did = did;
        return this;
    }

    public Date getOnline() {
        return online;
    }

    public Orderworker setOnline(Date online) {
        this.online = online;
        return this;
    }

    public double getPerdaily() {
        return perdaily;
    }

    public Orderworker setPerdaily(double perdaily) {
        this.perdaily = perdaily;
        return this;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public Orderworker setCoefficient(double coefficient) {
        this.coefficient = coefficient;
        return this;
    }

    public double getAvedaily() {
        return avedaily;
    }

    public Orderworker setAvedaily(double avedaily) {
        this.avedaily = avedaily;
        return this;
    }

    public double getAdddaily() {
        return adddaily;
    }

    public Orderworker setAdddaily(double adddaily) {
        this.adddaily = adddaily;
        return this;
    }

    public double getAnadaily() {
        return anadaily;
    }

    public Orderworker setAnadaily(double anadaily) {
        this.anadaily = anadaily;
        return this;
    }

    public int getPltime() {
        return pltime;
    }

    public Orderworker setPltime(int pltime) {
        this.pltime = pltime;
        return this;
    }

    public int getTimecons() {
        return timecons;
    }

    public Orderworker setTimecons(int timecons) {
        this.timecons = timecons;
        return this;
    }

    public int getNocoeanalysis() {
        return nocoeanalysis;
    }

    public Orderworker setNocoeanalysis(int nocoeanalysis) {
        this.nocoeanalysis = nocoeanalysis;
        return this;
    }

    public int getAddcoeanalysis() {
        return addcoeanalysis;
    }

    public Orderworker setAddcoeanalysis(int addcoeanalysis) {
        this.addcoeanalysis = addcoeanalysis;
        return this;
    }

    public int getAcproducttime() {
        return acproducttime;
    }

    public Orderworker setAcproducttime(int acproducttime) {
        this.acproducttime = acproducttime;
        return this;
    }

    public double getTimecomrate() {
        return timecomrate;
    }

    public Orderworker setTimecomrate(double timecomrate) {
        this.timecomrate = timecomrate;
        return this;
    }

    public double getTotalwages() {
        return totalwages;
    }

    public Orderworker setTotalwages(double totalwages) {
        this.totalwages = totalwages;
        return this;
    }

    public double getAvesalary() {
        return avesalary;
    }

    public Orderworker setAvesalary(double avesalary) {
        this.avesalary = avesalary;
        return this;
    }
}
