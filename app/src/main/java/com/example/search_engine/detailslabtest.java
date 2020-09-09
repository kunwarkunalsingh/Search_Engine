package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class detailslabtest extends AppCompatActivity {
    TextView t1;
    EditText en,em,ea,el,ep;
    Button hebtn;
    String amt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailslabtest);
        Intent types=this.getIntent();
        String t=types.getExtras().getString("tests");
        t1=findViewById(R.id.th);
        en=findViewById(R.id.tname);
        em=findViewById(R.id.tmob);
        ea=findViewById(R.id.tpin);
        el=findViewById(R.id.tadd);
        ep=findViewById(R.id.tland);
        hebtn=findViewById(R.id.tdb);

        if(t.equals("Complete Blood Count")){
                    amt="Rs2500";
                }
                else if (t.equals("Comprehensive Metabolic Panel")){
                    amt="Rs2200";
                }
                else if(t.equals("Thyroid Stimulating Hormone")){
                    amt="Rs3000";
                }
                else if (t.equals("Urinalysis")){
                    amt="Rs1800";
                }
                else if (t.equals("Basic Metabolic Panel")){
                    amt="Rs1250";
                }
                else if (t.equals("Prothrombin Time")){
                    amt="Rs3420";
                }
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
                if(name.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please enter the name",Toast.LENGTH_SHORT).show();
                }
                if(Mobile.length()>10 || Mobile.length()!=10)
                {
                    Toast.makeText(getApplicationContext(),"Not a valid Mobile number",Toast.LENGTH_SHORT).show();
                }
                if (Pincode.length()>6 || Pincode.length()!=6)
                {
                    Toast.makeText(getApplicationContext(),"Not a valid pincode",Toast.LENGTH_SHORT).show();
                }
                if(Address.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please provide the address",Toast.LENGTH_SHORT).show();
                }
                if (Landmark.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Please provide landmark for delivery", Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent htest = new Intent(getApplicationContext(),testlab.class);
                    htest.putExtra("nm", name);
                    htest.putExtra("mob", Mobile);
                    htest.putExtra("pin", Pincode);
                    htest.putExtra("add", Address);
                    htest.putExtra("land", Landmark);
                    htest.putExtra("amount",amt);
                    startActivity(htest);
                }
            }
        });
    }
}
