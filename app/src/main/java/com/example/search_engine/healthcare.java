package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class healthcare extends AppCompatActivity {
TextView t1;
Spinner sp1;
Button btn;
String products[]={"Choose the type of product","Personal Care","Nutrition,Vitamins,Supplement"},pro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthcare);
        ArrayAdapter<String> adap=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,products);
        t1=findViewById(R.id.txt);
        sp1=findViewById(R.id.sp);
        btn=findViewById(R.id.b1);
        sp1.setAdapter(adap);

        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pro=sp1.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pro.equals("Choose the type of product")){
                    Toast.makeText(getApplicationContext(), "Please select the product", Toast.LENGTH_SHORT).show();
                }
                else if(pro.equals("Personal Care")) {
                    Intent i = new Intent(getApplicationContext(),producuttype.class);
                    i.putExtra("p",pro);
                    startActivity(i);
                }
                else if(pro.equals("Nutrition,Vitamins,Supplement")) {
                    Intent i = new Intent(getApplicationContext(), nutrition.class);
                    i.putExtra("p", pro);
                    startActivity(i);
                }


                }
        });

    }
}
