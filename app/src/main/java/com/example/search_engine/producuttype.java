package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class producuttype extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9;
    Button btn;
    EditText quan1,quan2,quan3,quan4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producuttype);
        Intent i=this.getIntent();
        String pr=i.getExtras().getString("p");
        t1=findViewById(R.id.txt);
        t2=findViewById(R.id.txt7);//Bio oil
        t3=findViewById(R.id.txt2);//Mouthwash
        t5=findViewById(R.id.txt1);//paste
        t6=findViewById(R.id.txt8);//soap
        t4=findViewById(R.id.textView11);// mrp of bio oil
        t7=findViewById(R.id.textView12);//mrp of mouthwash
        t8=findViewById(R.id.textView13);// mrp of paste
        t9=findViewById(R.id.textView14);//mrp of soap


        btn=findViewById(R.id.bt);
        quan1=findViewById(R.id.q1);//quant of bio oil
        quan2=findViewById(R.id.q2);//quant of mouthwash
        quan3=findViewById(R.id.q3);//quant of paste
        quan4=findViewById(R.id.q4);//quant of soap


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
                    sum = sum + (quant1 * 700);
                }

                if (quant2 != 0) {
                    sum = sum + (quant2 * 185);
                }


                if (quant3 != 0) {
                    sum = sum + (quant3 * 125);
                }

                if (quant4 != 0) {
                    sum = sum + (quant4 * 150);
                }

                if(sum==0)
                {
                    Toast.makeText(getApplicationContext(),"Please select an item",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    coins=sum/250;

                    Intent val=new Intent(getApplicationContext(),healthproductcart.class);
                    val.putExtra("s",sum);
                    val.putExtra("coin",coins);
                    startActivity(val);
                }




            }
        });



    }

}
