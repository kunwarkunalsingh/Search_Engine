package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class payment extends AppCompatActivity {
    TextView txt1;
    Button paybt;
    RadioGroup radiog;
    RadioButton radioB;
    String nm,mo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        Intent pay=this.getIntent();
        nm=pay.getExtras().getString("n");
        mo=pay.getExtras().getString("m");
        txt1=findViewById(R.id.txt);
        paybt=findViewById(R.id.pbt);
        radiog=findViewById(R.id.rg);



        paybt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioB=findViewById(radiog.getCheckedRadioButtonId());


                    Intent th = new Intent(getApplicationContext(),healtthank.class);
                    th.putExtra("names",nm);
                    th.putExtra("mobileno",mo);
                    startActivity(th);

                }
        });
    }
}
