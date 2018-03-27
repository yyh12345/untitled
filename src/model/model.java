package model;

import java.sql.Date;

public class model {

    private String cname;               //客户名称
    private String crank;                   //客户级别
    private String did;                       //款号
    private String style;                   //款式
    private String sdetailed;           //款式细分
    private int  quantity;                        //生产数量
    private  double iE_Price;                //IE工价
    private double   facdirector;	      //	厂长确认系数
    private double  cdirector;	              //	客户系数
    private double strdirector	;         //	数量结构系数
    private double coefficient;                //	加系数工价
    private String tname;           //生产班组小组名称
    private double teamnumber;     //	小组人数
    private Date online;                             //  上线时间
    private Date offline;                       //下线时间
    private  double days;                    //	生产天数
    private double perdaily;                    //	人均日产量
    private double avedaily;	                 //无	平均日产量
    private double  adddaily;                  //	加系数分析日产量
    private double  anadaily;                   	//	分析日产量
    private double partime;	            //分析时间
    private int pltime;                                  //	无	加系数分析时间
    private double  videotime;         //视频时间
    private int timecons;                           //	实际每款耗时
    private double coereality;          //加系数实际产量达成率
    private double uninyield;           //未加系数产量达成率
    private double coetarget;           //加系数产量目标达成率
    private int nocoeanalysis;	            //各款未加系数分析总时间
    private int addcoeanalysis;                 	//各款加系数分析总时间
    private int acproducttime;                      //各款实际生产总时间
    private double timecomrate;	            //时间达成率
    private double totalwages ;             //	合计工资
    private double avesalary;		       //平均工资

    public model() {
    }

    public String getCname() {
        return cname;
    }

    public model setCname(String cname) {
        this.cname = cname;
        return this;
    }

    public String getCrank() {
        return crank;
    }

    public model setCrank(String crank) {
        this.crank = crank;
        return this;
    }

    public String getDid() {
        return did;
    }

    public model setDid(String did) {
        this.did = did;
        return this;
    }

    public String getStyle() {
        return style;
    }

    public model setStyle(String style) {
        this.style = style;
        return this;
    }

    public String getSdetailed() {
        return sdetailed;
    }

    public model setSdetailed(String sdetailed) {
        this.sdetailed = sdetailed;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public model setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public double getiE_Price() {
        return iE_Price;
    }

    public model setiE_Price(double iE_Price) {
        this.iE_Price = iE_Price;
        return this;
    }

    public double getFacdirector() {
        return facdirector;
    }

    public model setFacdirector(double facdirector) {
        this.facdirector = facdirector;
        return this;
    }

    public double getCdirector() {
        return cdirector;
    }

    public model setCdirector(double cdirector) {
        this.cdirector = cdirector;
        return this;
    }

    public double getStrdirector() {
        return strdirector;
    }

    public model setStrdirector(double strdirector) {
        this.strdirector = strdirector;
        return this;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public model setCoefficient(double coefficient) {
        this.coefficient = coefficient;
        return this;
    }

    public String getTname() {
        return tname;
    }

    public model setTname(String tname) {
        this.tname = tname;
        return this;
    }

    public double getTeamnumber() {
        return teamnumber;
    }

    public model setTeamnumber(double teamnumber) {
        this.teamnumber = teamnumber;
        return this;
    }

    public Date getOnline() {
        return online;
    }

    public model setOnline(Date online) {
        this.online = online;
        return this;
    }

    public Date getOffline() {
        return offline;
    }

    public model setOffline(Date offline) {
        this.offline = offline;
        return this;
    }

    public double getDays() {
        return days;
    }

    public model setDays(double days) {
        this.days = days;
        return this;
    }

    public double getPerdaily() {
        return perdaily;
    }

    public model setPerdaily(double perdaily) {
        this.perdaily = perdaily;
        return this;
    }

    public double getAvedaily() {
        return avedaily;
    }

    public model setAvedaily(double avedaily) {
        this.avedaily = avedaily;
        return this;
    }

    public double getAdddaily() {
        return adddaily;
    }

    public model setAdddaily(double adddaily) {
        this.adddaily = adddaily;
        return this;
    }

    public double getAnadaily() {
        return anadaily;
    }

    public model setAnadaily(double anadaily) {
        this.anadaily = anadaily;
        return this;
    }

    public double getPartime() {
        return partime;
    }

    public model setPartime(double partime) {
        this.partime = partime;
        return this;
    }

    public int getPltime() {
        return pltime;
    }

    public model setPltime(int pltime) {
        this.pltime = pltime;
        return this;
    }

    public double getVideotime() {
        return videotime;
    }

    public model setVideotime(double videotime) {
        this.videotime = videotime;
        return this;
    }

    public int getTimecons() {
        return timecons;
    }

    public model setTimecons(int timecons) {
        this.timecons = timecons;
        return this;
    }

    public double getCoereality() {
        return coereality;
    }

    public model setCoereality(double coereality) {
        this.coereality = coereality;
        return this;
    }

    public double getUninyield() {
        return uninyield;
    }

    public model setUninyield(double uninyield) {
        this.uninyield = uninyield;
        return this;
    }

    public double getCoetarget() {
        return coetarget;
    }

    public model setCoetarget(double coetarget) {
        this.coetarget = coetarget;
        return this;
    }

    public int getNocoeanalysis() {
        return nocoeanalysis;
    }

    public model setNocoeanalysis(int nocoeanalysis) {
        this.nocoeanalysis = nocoeanalysis;
        return this;
    }

    public int getAddcoeanalysis() {
        return addcoeanalysis;
    }

    public model setAddcoeanalysis(int addcoeanalysis) {
        this.addcoeanalysis = addcoeanalysis;
        return this;
    }

    public int getAcproducttime() {
        return acproducttime;
    }

    public model setAcproducttime(int acproducttime) {
        this.acproducttime = acproducttime;
        return this;
    }

    public double getTimecomrate() {
        return timecomrate;
    }

    public model setTimecomrate(double timecomrate) {
        this.timecomrate = timecomrate;
        return this;
    }

    public double getTotalwages() {
        return totalwages;
    }

    public model setTotalwages(double totalwages) {
        this.totalwages = totalwages;
        return this;
    }

    public double getAvesalary() {
        return avesalary;
    }

    public model setAvesalary(double avesalary) {
        this.avesalary = avesalary;
        return this;
    }

}
