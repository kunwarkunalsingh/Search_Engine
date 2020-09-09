package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class cart extends AppCompatActivity {
    TextView text1,text2,text3,text4,text5,text6,text7,text8;
    Button btn;
    String n,m;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        Intent horder=this.getIntent();
        Intent val=this.getIntent();
        double total=val.getExtras().getDouble("total");
        double co=val.getExtras().getDouble("c");
        text1=findViewById(R.id.t1);
        text2=findViewById(R.id.t2);
        text3=findViewById(R.id.t3);
        text4=findViewById(R.id.t4);
        text5=findViewById(R.id.t5);
        text6=findViewById(R.id.t6);
        text7=findViewById(R.id.t7);
        text8=findViewById(R.id.coin);

        btn=findViewById(R.id.b1);


         n=horder.getExtras().getString("nm");
         m=horder.getExtras().getString("mob");
         String p=horder.getExtras().getString("pin");
         String a=horder.getExtras().getString("add");
         String l=horder.getExtras().getString("land");


               text2.setText("Name:- " + n );
               text3.setText("Mobile no:- " + m);
               text4.setText("Address:- " + a);
               text5.setText("Landmark:- " + l);
               text6.setText("Pincode:- " + p );
               text7.setText("Total Amount....................." + total);
               text8.setText("Congartulations you got " + co + "coins");



           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Intent pay =new Intent(getApplicationContext(),payment.class);
                   pay.putExtra("name",n);
                   pay.putExtra("mobile",m);
                   startActivity(pay);
               }
           });
    }
}
