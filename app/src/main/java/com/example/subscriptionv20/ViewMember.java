package com.example.subscriptionv20;

public class ViewMember {
    String name;
    String Startsub;
    String Endsub;
    String Totalamt;
    String pkgtype;
    String MACid;
    String paymentmethod;
    String paymentoption;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartsub() {
        return Startsub;
    }

    public void setStartsub(String startsub) {
        this.Startsub = startsub;
    }

    public String getEndsub() {
        return Endsub;
    }

    public void setEndsub(String endsub) {
        this.Endsub = endsub;
    }

    public String getTotalamt() {
        return Totalamt;
    }

    public void setTotalamt(String totalamt) {
        this.Totalamt = totalamt;
    }

    public String getPkgtype() {
        return pkgtype;
    }

    public void setPkgtype(String pkgtype) {
        this.pkgtype = pkgtype;
    }

    public String getMACid() {
        return MACid;
    }

    public void setMACid(String MACid) {
        this.MACid = MACid;
    }

    public String getPaymentmethod() {
        return paymentmethod;
    }

    public void setPaymentmethod(String paymentmethod) {
        this.paymentmethod = paymentmethod;
    }

    public String getPaymentoption() {
        return paymentoption;
    }

    public void setPaymentoption(String paymentoption) {
        this.paymentoption = paymentoption;
    }
}
