package com.example.subscriptionv20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddCustomer extends AppCompatActivity {
    ImageButton send;
    EditText name ;
    EditText startsub;
    EditText endsub;
    TextView remmo ;
    TextView remda ;
    EditText etotalamt ;
    EditText packageT ;
    EditText macid ;


    RadioGroup paid ;
    RadioButton paidchoice ;
    RadioButton fully;

    RadioGroup modeofpay;
    RadioButton payoption;

    String cname ;
    String startofsub;
    String endofsub;
    String totalamt ;
    String mac_id;
    String packagetype ;
    String storePaidoptn;
    String typeofpay;
    DatabaseReference reff;
    Member member;

    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_customer);
        //Toast.makeText(this, "Welcome!", Toast.LENGTH_SHORT).show();
        send = (ImageButton) findViewById(R.id.send);
        name = (EditText)findViewById(R.id.ename);
        startsub = (EditText)findViewById(R.id.estsub);
        endsub = (EditText)findViewById(R.id.eesub);
        remmo = (TextView)findViewById(R.id.vrmo);
        remda = (TextView)findViewById(R.id.vrda);
        etotalamt = (EditText)findViewById(R.id.etotamt);
        packageT = (EditText)findViewById(R.id.evpack);
        macid = (EditText)findViewById(R.id.emacid);

        paid = (RadioGroup)findViewById(R.id.gpaid);


        modeofpay = (RadioGroup)findViewById(R.id.gmopay);

        //TransferValues();
       // member = new Member();
        reff = FirebaseDatabase.getInstance().getReference();

        Toast.makeText(this, "Firebase connection Success !! Your good to go !!", Toast.LENGTH_SHORT).show();

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             /*   member.Setname(cname);
                member.SetStarsub(startofsub);
                member.SetEndsub(endofsub);
                member.Setpkgtype(packagetype);
                member.SetMACid(mac_id);
                member.SetToalamt(totalamt);*/
                int paidid = paid.getCheckedRadioButtonId();
                paidchoice = (RadioButton) findViewById(paidid);
                storePaidoptn = paidchoice.getText().toString();
                int mopayid = modeofpay.getCheckedRadioButtonId();
                payoption = (RadioButton) findViewById(mopayid);
                typeofpay = payoption.getText().toString();
                cname = name.getText().toString();
                startofsub = startsub.getText().toString();
                endofsub = endsub.getText().toString();
                totalamt = etotalamt.getText().toString();
                mac_id= macid.getText().toString();
                packagetype = packageT.getText().toString();

             String id = reff.push().getKey();
             member = new Member(cname, startofsub, endofsub, totalamt, packagetype, mac_id);
                Toast.makeText(AddCustomer.this, id, Toast.LENGTH_SHORT).show();
            reff.child(id).setValue(member);


            }
        });



        // Toast.makeText(this, storePaidoptn, Toast.LENGTH_SHORT).show();


    }
   /* public void TransferValues(){

            send.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int paidid = paid.getCheckedRadioButtonId();
                    paidchoice = (RadioButton) findViewById(paidid);
                    storePaidoptn = paidchoice.getText().toString();
                    int mopayid = modeofpay.getCheckedRadioButtonId();
                    payoption = (RadioButton) findViewById(mopayid);
                    typeofpay = payoption.getText().toString();
                    cname = name.getText().toString();
                    startofsub = startsub.getText().toString();
                    endofsub = endsub.getText().toString();
                    totalamt = etotalamt.getText().toString();
                    mac_id= macid.getText().toString();
                    packagetype = packageT.getText().toString();

                    member.Setname(cname);
                    member.SetStarsub(startofsub);
                    member.SetEndsub(endofsub);
                    member.Setpkgtype(packagetype);
                    member.SetMACid(mac_id);
                    member.SetToalamt(totalamt);

                    reff.push().setValue(member);
                     // Toast.makeText(AddCustomer.this,storePaidoptn, Toast.LENGTH_SHORT).show();

                    //Toast.makeText(AddCustomer.this,"Payment Option: "+ storePaidoptn+" Type of Payment: "+typeofpay, Toast.LENGTH_SHORT).show();



                }
            });


  //      Toast.makeText(this, paidchoice.getText().toString(), Toast.LENGTH_SHORT).show();


    }*/
}

