package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class locality extends AppCompatActivity {
    String state[]={"Select the locality","Model Colony","JM Road","Kothrud"},sta;
    Spinner s2;
    Button btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locality);
        ArrayAdapter<String> stat=new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,state);
        s2=findViewById(R.id.sp2);
        btn2=findViewById(R.id.b2);

        s2.setAdapter(stat);

        s2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                sta=s2.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sta.equals("Select the locality")){
                    Toast.makeText(getApplicationContext(), "Please select the locality", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(getApplicationContext(), search_hospitals.class);
                    i.putExtra("area", sta);
                    startActivity(i);

                }
            }
        });
    }
}
