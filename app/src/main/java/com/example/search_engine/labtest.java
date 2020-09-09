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

public class labtest extends AppCompatActivity {
    TextView txt1;
    Spinner sp;
    Button btn;
    String tests[]={"Choose the tests","Complete Blood Count","Comprehensive Metabolic Panel","Thyroid Stimulating Hormone","Urinalysis","Basic Metabolic Panel","Prothrombin Time"},str;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labtest);
        Intent i=this.getIntent();
        ArrayAdapter<String> test=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,tests);
        txt1=findViewById(R.id.textView2);
        sp=findViewById(R.id.spinner);
        btn=findViewById(R.id.button3);
        sp.setAdapter(test);


        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                str=sp.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (str.equals("Choose the tests")){
                    Toast.makeText(getApplicationContext(), "Please select the test", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent types = new Intent(getApplicationContext(),detailslabtest.class);
                    types.putExtra("tests", str);
                    startActivity(types);

                }
            }
        });
    }
}
