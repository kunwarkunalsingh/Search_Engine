package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class search_hospitals extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_hospitals);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
        t3=findViewById(R.id.txt3);
        t4=findViewById(R.id.txt4);
        t5=findViewById(R.id.txt5);
        t6=findViewById(R.id.txt6);
        Intent i=this.getIntent();
        String ar=i.getExtras().getString("area");

        if(ar.equals("Model Colony")){
            t2.setText("Joglekar Hospital\n"+
                    "Address: 1066-A, Chatuhshrungi Rd, Swastik Society, Model Colony, Shivajinagar, Pune, Maharashtra 411016");
            t3.setText("Kanitkar Hospital\n"+
                    "Address: 1098/18, Model Colony Road, Shivaji Nagar, near Post Office, Pune, Maharashtra 411016");
            t4.setText("Swanand Maternity Hospital\n"+
                    "Address: 1011/6A,Deep Bunglow Chowk, Opp: Apollo Medicals,Model Colony,Shivaji Nagar,near Senapati Bapat Road,Pune,Maharashtra 411016");
            t5.setText("Bapat Hospital\n"+
                    "Address: 1137/8, Lakaki Rd, Rage Path, Model Colony, Shivajinagar, Pune, Maharashtra 411016");
            t6.setText("MMF Ratna Memorial Hospital\n"+
                    "Address: 968, Senapati Bapat Rd, Sheti Mahamandal, Shivaji Co operative Housing Society, Ramoshivadi, Wadarvadi, Pune, Maharashtra 411053");

        }
        if(ar.equals("JM Road")){
            t2.setText("Sathe Hospital\n"+
                    "Address:759, 4, Above Post Office, Deccan Gymkhana, Pune, Maharashtra 411004");
            t3.setText("Phadke Hospital\n"+
                    "Address: S.No.1260B, Jangli Maharaj Road Deccan gym khana, Opp, Mc Donald's, Shivajinagar, Pune, Maharashtra 411004");
            t4.setText("Indira Maternity Home\n"+
                    "Address: 1277, Jangali Maharaj Rd, Deccan Gymkhana, Pune, Maharashtra 411004");
            t5.setText("MJM Hospital\n"+
                    "Address:Janardhan Sadan, 1194/23, Ghole Rd, Sud Nagar, Shivajinagar, Pune, Maharashtra 411005");
            t6.setText("Deendayal Memorial Hospital\n"+
                    "Address:926, Fergusson college campus Rd, Fergusson College Campus, Shivajinagar, Pune, Maharashtra 411004");

        }
        if(ar.equals("Kothrud")){
            t2.setText("Sahyadri Hospitals\n"+
                    " Neena Co-op. Housing Society, Plot No. 9-B, S.No.1484A/B, Opp. Vanaz, Paud Rd, Lokmanya Colony, Kothrud, Pune, Maharashtra 411038");
            t3.setText("Deoyani Multi Speciality Hospital\n"+
                    "Address: Plot No, 121, Lane Number 4, Dahanukar Colony, Kothrud, Pune, Maharashtra 411038");
            t4.setText("Sathe multispeciality hospital\n"+
                    "Address: Shankar Nagari, B Building, GROUND FLOOR, Paud Rd, next to vanaz and cosmos bank, Kothrud, Pune, Maharashtra 411038");
            t5.setText("Suyash Hospital\n"+
                    "Address: Plot No.1, New, Kothrud Bus Stand Rd, Dattachhaya Tejas Society, Behind, Dahanukar Colony, Kothrud, Pune, Maharashtra 411058");
            t6.setText("Parivartan Ayurvedic Hospital\n"+
                    "Address: Pethkar Plaza, Balwantpuram. Off Paud Road, Silver Crest Hill Town Rd, Shivtirth Nagar, Kothrud, Pune, Maharashtra 411038");
        }


    }
}
