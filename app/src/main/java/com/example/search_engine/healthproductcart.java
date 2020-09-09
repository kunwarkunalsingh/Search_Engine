package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class healthproductcart extends AppCompatActivity {
    TextView t1;
    EditText en,em,ea,el,ep;
    Button hebtn;
    double total;
    double coi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthproductcart);
        Intent val=this.getIntent();
        total=val.getExtras().getDouble("s");
        coi=val.getExtras().getDouble("coin");
        t1=findViewById(R.id.del);
        en=findViewById(R.id.ename);
        em=findViewById(R.id.emob);
        ea=findViewById(R.id.epin);
        el=findViewById(R.id.eadd);
        ep=findViewById(R.id.eland);
        hebtn=findViewById(R.id.hb);

        hebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=en.getText().toString();
                String Mobile=em.getText().toString();
                String Pincode=ea.getText().toString();
                String Address=el.getText().toString();
                String Landmark=ep.getText().toString();
                if(name.equals("") || Mobile.equals(" ") || Pincode.equals("") || Address.equals("") || Landmark.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please provide the details for delivery",Toast.LENGTH_SHORT).show();
                }
                else if(name.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please enter the name",Toast.LENGTH_SHORT).show();
                }
                else if(Mobile.length()>10 || Mobile.length()!=10)
                {
                    Toast.makeText(getApplicationContext(),"Not a valid Mobile number",Toast.LENGTH_SHORT).show();
                }
                else if (Pincode.length()>6 || Pincode.length()!=6)
                {
                    Toast.makeText(getApplicationContext(),"Not a valid pincode",Toast.LENGTH_SHORT).show();
                }
                else if(Address.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please provide the address",Toast.LENGTH_SHORT).show();
                }
                else if (Landmark.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please provide landmark for delivery", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent horder = new Intent(getApplicationContext(), cart.class);
                    horder.putExtra("nm", name);
                    horder.putExtra("mob", Mobile);
                    horder.putExtra("pin", Pincode);
                    horder.putExtra("add", Address);
                    horder.putExtra("land", Landmark);
                    horder.putExtra("total", total);
                    horder.putExtra("c", coi);
                    startActivity(horder);
                }
            }
        });
    }
}
