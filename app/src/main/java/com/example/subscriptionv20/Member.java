package com.example.subscriptionv20;

public class Member {
     String name;
     String Startsub;
     String Endsub;
     String Totalamt;
     String pkgtype;
     String MACid;
     String paymentmethod;
     String paymentoption;

    public Member(){

    }

    public Member(String name,String startsub, String endsub, String totalamt, String pkgtype, String macid,String paymentmethod,String paymentoption){
        this.name = name;
        this.Startsub = startsub;
        this.Endsub = endsub;
        this.Totalamt = totalamt;
        this.pkgtype = pkgtype;
        this.MACid = macid;
        this.paymentmethod = paymentmethod;
        this.paymentoption = paymentoption;
    }

    public String Getname(){
        return name;
    }

    public void Setname(String Name){
        this.name = Name;
    }
    public String GetStartsub(){
        return Startsub;
    }

    public void SetStarsub(String startsub){
        this.Startsub = startsub;
    }

    public String GetEndsub(){
        return Endsub;
    }

   public void SetEndsub(String endsub){
        this.Endsub = endsub;
    }
    public String GetTotalamt(){
        return Totalamt;
    }

    public void SetToalamt(String totalamt){
        this.Totalamt = totalamt;
    }
    public String Getpkgtype(){
        return pkgtype;
    }

   public void Setpkgtype(String Pkgtype){
        this.pkgtype = Pkgtype;
    }
    public String GetMACid(){
        return MACid;
    }

    public void SetMACid(String macid){
        this.MACid = macid;
    }
    public String GetPaymentMethod(){
        return paymentmethod;
    }
    public void SetPaymentMethod(String Paymentmethod){
        this.paymentmethod = Paymentmethod;
    }
    public String GetPaymentOption(){
        return paymentoption;
    }
    public void SetPaymentOption(String PaymentOption){
        this.paymentoption = PaymentOption;
    }

}