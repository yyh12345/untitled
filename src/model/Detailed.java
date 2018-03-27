package model;

public class Detailed {
    //Style_Detailed	Varchar(25)	Not Null	主键	款式细分
    //Style	Varchar(25)	Not Null	无	款式
    private String sdetailed;           //款式细分
    private String style;                   //款式

    public Detailed() {
    }

    public Detailed(String sdetailed, String style) {
        this.sdetailed = sdetailed;
        this.style = style;
    }

    public String getSdetailed() {
        return sdetailed;
    }

    public Detailed setSdetailed(String sdetailed) {
        this.sdetailed = sdetailed;
        return this;
    }

    public String getStyle() {
        return style;
    }

    public Detailed setStyle(String style) {
        this.style = style;
        return this;
    }
}
