package com.example.subscriptionv20;

public class Member {
    private String name;
    private String Startsub;
    private String Endsub;
    private String Totalamt;
    private String pkgtype;
    private String MACid;

    public Member(){

    }

    public Member(String name,String startsub, String endsub, String totalamt, String pkgtype, String macid){
        this.name = name;
        this.Startsub = startsub;
        this.Endsub = endsub;
        this.Totalamt = totalamt;
        this.pkgtype = pkgtype;
        this.MACid = macid;
    }

    public String Getname(){
        return name;
    }

   // public void Setname(String Name){
    //    name = Name;
  //  }
    public String GetStartsub(){
        return Startsub;
    }

   /* public void SetStarsub(String startsub){
        Startsub = startsub;
    }*/

    public String GetEndsub(){
        return Endsub;
    }

  /*  public void SetEndsub(String endsub){
        Endsub = endsub;
    }*/
    public String GetTotalamt(){
        return Totalamt;
    }

   /* public void SetToalamt(String totalamt){
        Totalamt = totalamt;
    }*/
    public String Getpkgtype(){
        return pkgtype;
    }

   /* public void Setpkgtype(String Pkgtype){
        pkgtype = Pkgtype;
    }*/
    public String GetMACid(){
        return MACid;
    }

    /*public void SetMACid(String macid){
        MACid = macid;
    }
    */

}