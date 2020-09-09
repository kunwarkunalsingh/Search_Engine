package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class testthankyou extends AppCompatActivity {
    TextView txt;
    Button tbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testthankyou);

        txt=findViewById(R.id.textView15);
        tbtn=findViewById(R.id.button5);

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent th=new Intent(getApplicationContext(),complete.class);
                startActivity(th);
            }
        });
    }
}
