package model;

public class Detailed {
    //Style_Detailed	Varchar(25)	Not Null	����	��ʽϸ��
    //Style	Varchar(25)	Not Null	��	��ʽ
    private String sdetailed;           //��ʽϸ��
    private String style;                   //��ʽ

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
