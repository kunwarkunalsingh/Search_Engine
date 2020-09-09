package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class nutrition extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    Button btn;
    EditText quan1,quan2,quan3,quan4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
        Intent i=this.getIntent();
        String pr=i.getExtras().getString("p");
        t1=findViewById(R.id.txt);
        t2=findViewById(R.id.ntxt7);//boost
        t3=findViewById(R.id.ncomp);//complain
        t5=findViewById(R.id.nens);//ens
        t6=findViewById(R.id.nclip);//cipla
        t4=findViewById(R.id.nboost);// mrp of boostl
        t7=findViewById(R.id.ncompr);//mrp of complain
        t8=findViewById(R.id.nenspr);// mrp of ens
        t9=findViewById(R.id.nclippr);//mrp of cipla

        btn=findViewById(R.id.bt);
        quan1=findViewById(R.id.q1);//quant of boost
        quan2=findViewById(R.id.q2);//quant of complain
        quan3=findViewById(R.id.q3);//quant of ens
        quan4=findViewById(R.id.q4);//quant of cipla


        t1.setText("Showing the Result for " + pr);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String q1=quan1.getText().toString();
                String q2=quan2.getText().toString();
                String q3=quan3.getText().toString();
                String q4=quan4.getText().toString();

                /*String prod1=t2.getText().toString();
                String prod2=t3.getText().toString();
                String prod3=t5.getText().toString();
                String prod4=t6.getText().toString();
                String mrpoil=t4.getText().toString();
                String mrpmouth=t7.getText().toString();
                String mrppaste=t8.getText().toString();
                String mrpsoap=t9.getText().toString();*/

                double quant1 = Double.parseDouble(q1);
                double quant2 = Double.parseDouble(q2);
                double quant3 = Double.parseDouble(q3);
                double quant4 = Double.parseDouble(q4);
                double sum=0;
                double coins;
                if (quant1 != 0) {
                    sum = sum + (quant1 * 351);
                }

                if (quant2 != 0) {
                    sum = sum + (quant2 * 492);
                }


                if (quant3 != 0) {
                    sum = sum + (quant3 * 361);
                }

                if (quant4 != 0) {
                    sum = sum + (quant4 * 284);
                }
                //Toast.makeText(getApplicationContext(),sum+"",Toast.LENGTH_SHORT).show();

                if(sum==0)
                {
                    Toast.makeText(getApplicationContext(),"Please select an item",Toast.LENGTH_SHORT).show();
                }
                else {

                    coins=sum/250;

                    Intent val = new Intent(getApplicationContext(),healthproductcart.class);
                    val.putExtra("s", sum);
                    val.putExtra("coin",coins);
                    startActivity(val);
                }

                /*val.putExtra("oil",prod1);
                val.putExtra("mouthw",prod2);
                val.putExtra("paste",prod3);
                val.putExtra("soap",prod4);*/


            }
        });


    }
}
