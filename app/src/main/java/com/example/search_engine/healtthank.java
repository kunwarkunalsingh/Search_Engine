package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class healtthank extends AppCompatActivity {
    TextView ms;
    Button tbh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healtthank);
        Intent th=this.getIntent();
        Intent horder=this.getIntent();
        String nam=horder.getExtras().getString("names");
        String mobile=horder.getExtras().getString("mobileno");
        ms=findViewById(R.id.ht);
        tbh=findViewById(R.id.htb);

        ms.setText("Thank You  for shopping with us our executive will contact you soon for the update" );

        tbh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thank=new Intent(getApplicationContext(),complete.class);
                startActivity(thank);
            }
        });
    }
}
