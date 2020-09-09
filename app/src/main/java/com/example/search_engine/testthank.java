package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class testthank extends AppCompatActivity {
    TextView ms;
    Button tesb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testthank);
        Intent th=this.getIntent();
        Intent detailstest=this.getIntent();
        Intent htest=this.getIntent();
        String names=htest.getExtras().getString("nm");
        String mobileno=htest.getExtras().getString("mob");
        ms=findViewById(R.id.testh);
        tesb=findViewById(R.id.testb);

        ms.setText("Thank You " + names + " for shopping with us our executive will contact you soon for the update on this contact number " + mobileno);

        tesb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thank=new Intent(getApplicationContext(),complete.class);
                startActivity(thank);
            }
        });
    }
}
