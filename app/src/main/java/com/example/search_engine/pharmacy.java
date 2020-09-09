package com.example.search_engine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class pharmacy extends AppCompatActivity {
TextView t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pharmacy);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
        t3=findViewById(R.id.txt3);
        t4=findViewById(R.id.txt4);
        t5=findViewById(R.id.txt5);
        t6=findViewById(R.id.txt6);
        Intent i=this.getIntent();
        String ar=i.getExtras().getString("area");

        if(ar.equals("Model Colony")){
            t2.setText("Raj Medico\n"+
                    "1032/A, Chinnar Heights, Shop No. 6, Deep Bangla Chowk,shivajinagar, Pune, Maharashtra 411016");
            t3.setText("Arihant Medical Stores\n"+
                    "Address:  Lakaki Rd, Model Colony, Shivajinagar, Pune, Maharashtra 411016");
            t4.setText("Rekhi Medico\n"+
                    "Address: 1101, 1, next to Hotel Ambassador, Model Colony, Shivajinagar, Pune, Maharashtra 411016");
            t5.setText("OM MEDICAL\n"+
                    "Address: Near Om Super Market, Model Colony, Shivajinagar, Pune, Maharashtra 411016");
            t6.setText("Symbiosis medical shop\n"+
                    "Address:  1066-a, Chatuhshrungi Rd, Shivaji Nagar, Shivajinagar, Pune, Maharashtra 411016");

        }
        if(ar.equals("FC Road")){
            t2.setText("WELLNESS FOREVER PVT. LTD.\n"+
                    "Address:M.C, SHOP NO.3 & 4 GR FL,GOKUL NAGAR,FINAL PL NO. 559,(BHAMBURDRA, Fergusson College Rd, Shivajinagar, Pune, Maharashtra 411005\n");
            t3.setText("K. P. Homeopathic Pharmacy\n"+
                    "Address: 1130, Shivaji Nagar, Dnyaneshwar Paduka Chowk, Dnyaneshwar Paduka Chowk, Pune, Maharashtra 411016");
            t4.setText("Sunil Medical Stores\n"+
                    "Address: 1223, Fergusson College Rd, Ganeshwadi, Deccan Gymkhana, Pune, Maharashtra 411004");
            t5.setText("Pleasant Medical StoresPleasant Medical Stores\n"+
                    "Address: 917/2/B, Pleasant Business Park, Ganesh wadi, Fergusson College Rd, Pune, Maharashtra 411004");
            t6.setText("Batavia Medico\n"+
                    "Address: 1231/2, Fergusson College Rd, Shivajinagar, Pune, Maharashtra 411004");

        }
        if(ar.equals("Deccan Gymkhana")){
            t2.setText("Health Well Pharmacy\n"+
                    "Address: Ganeshwadi, Deccan Gymkhana, Pune, Maharashtra 411004\n");
            t3.setText("Chitale Medical\n"+
                    "Address: Shop No 8,deccan Mall,near Garware Bridge, Deccan Gymkhana, Pune, Maharashtra 411004");
            t4.setText("Fortis Healthworld\n"+
                    "Address:  Shop No-102, Opp. Kamla Nehru Park, Deccan Gymkhana, Pune-411004, Pune, Maharashtra 411004");
            t5.setText("Prasad Medical\n"+
                    "Address:  759/55, Near Post Office, Deccan Gymkhana, Pune, Maharashtra 411004");
            t6.setText("Annapurna Medical\n"+
                    "Address: Prabhat Rd, Deccan Gymkhana, Pune, Maharashtra 411004");
        }


    }

}
