package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class testlab extends AppCompatActivity {
    TextView tes1,tes2,tes3,tes4,tes5,tes6,tes7;
    Button testbtn;
    String amt,t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testlab);
        Intent htest=this.getIntent();
        String amt=htest.getExtras().getString("amount");

        tes1=findViewById(R.id.h);
        tes2=findViewById(R.id.n);
        tes3=findViewById(R.id.m);
        tes4=findViewById(R.id.a);
        tes5=findViewById(R.id.l);
        tes6=findViewById(R.id.p);
        tes7=findViewById(R.id.to);
        testbtn=findViewById(R.id.tb);

        String n=htest.getExtras().getString("nm");
        String m=htest.getExtras().getString("mob");
        String p=htest.getExtras().getString("pin");
        String a=htest.getExtras().getString("add");
        String l=htest.getExtras().getString("land");

        tes2.setText("Name:- " + n );
        tes3.setText("Mobile no:- " + m);
        tes4.setText("Address:- " + a);
        tes5.setText("Landmark:- " + l);
        tes6.setText("Pincode:- " + p );
        tes7.setText("Amount...................................... " +amt);



        testbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent t=new Intent(getApplicationContext(),testthankyou.class);
                startActivity(t);
            }
        });

    }
}
