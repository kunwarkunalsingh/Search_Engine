package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class doc extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);
        t1=findViewById(R.id.textView3);
        t2=findViewById(R.id.textView4);
        t3=findViewById(R.id.textView5);
        t4=findViewById(R.id.textView6);
        t5=findViewById(R.id.textView7);
        t6=findViewById(R.id.textView8);

        t2.setText("1) Dr Abhay Sharma\n"+ "Degree:-MBBS\n"+ "Mobile No.:- +919021236027");
        t3.setText("2) Dr AK Gatpaela\n"+ "Degree:-MBBS\n"+ "Mobile No.:- +919868881881");
        t4.setText("3) Dr Rakesh\n"+ "Degree:-MBBS\n"+ "Mobile No.:- +919730992211");
        t5.setText("4) Dr Titiyal\n"+ "Degree:-MBBS\n"+ "Mobile No.:- +919810649942");
        t6.setText("5) Dr MP Sharma\n"+ "Degree:-MBBS\n"+ "Mobile No.:- +919811619442");
    }
}
