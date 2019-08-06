package com.example.subscriptionv20;

import android.app.Activity;

import java.util.List;

public class DisplayCustomerDetails {

    Activity context;
    private List<Member> customerinfo;

    public DisplayCustomerDetails(Activity context, List<Member> customerinfo){
        ///super(Context,R.layout.)
        this.context= context;
        this.customerinfo = customerinfo;

    }

}