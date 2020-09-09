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

public class cmd extends AppCompatActivity {
TextView txt1,txt2;
Spinner s1;
String deasease[]={"Select the Disease","Common Cold","Cough","Fever Blisters","Common Fever","Sore Throat","Heartburn","Acidity","Hiccups","Sinus","Stomach ache",
        "Diarrhoea","Anaemia","Constipation","Backache","Acne"},str;

Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cmd);
        Intent i=this.getIntent();
        ArrayAdapter<String> adap=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,deasease);

        txt1=findViewById(R.id.t1);
        txt2=findViewById(R.id.t2);
        s1=findViewById(R.id.sp1);

        btn=findViewById(R.id.b1);

        s1.setAdapter(adap);

        s1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                str=s1.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  if (str.equals("Select the Disease")){
                    Toast.makeText(getApplicationContext(), "Please select some value", Toast.LENGTH_SHORT).show();
                }
                  else {
                      Intent i = new Intent(getApplicationContext(), rem.class);
                      i.putExtra("de", str);
                      startActivity(i);

                  }
            }
        });

    }
}
