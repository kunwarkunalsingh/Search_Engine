package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thankyou extends AppCompatActivity {
    TextView msg;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thankyou);
        Intent i= this.getIntent();
        Intent pay=this.getIntent();
        String na=i.getExtras().getString("nm");
        String mo=i.getExtras().getString("mob");
        msg=findViewById(R.id.textView10);
        button=findViewById(R.id.button4);

        msg.setText("Thank You " + na + " for shopping with us our executive will contact you soon for the update on this contact number " + mo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thank=new Intent(getApplicationContext(),complete.class);
                startActivity(thank);
            }
        });

    }
}
