package com.example.search_engine;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Pattern;


public class register extends AppCompatActivity {
FirebaseAuth.AuthStateListener authStateListener;
    TextView t1,t2,t3,t4,t5,t6;
    EditText name,mob,email,pass,conpass;
    Button btn;
    private FirebaseAuth mAuth;
    ProgressBar progres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.txt3);
        t4=findViewById(R.id.txt4);
        t5=findViewById(R.id.txt5);
        t6=findViewById(R.id.txt6);
        name=findViewById(R.id.etxt1);
        mob=findViewById(R.id.etxt2);
        email=findViewById(R.id.etxt3);
        pass=findViewById(R.id.etxt4);
        conpass=findViewById(R.id.etxt5);
        btn=findViewById(R.id.b1);
        progres=findViewById(R.id.progressBar2);
        mAuth = FirebaseAuth.getInstance();

        Intent i=this.getIntent();

        authStateListener=new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user=firebaseAuth.getCurrentUser();
            }
        };


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String em=email.getText().toString().trim();
                String check = pass.getText().toString().trim();
                String cpass = conpass.getText().toString().trim();
                String nam=name.getText().toString().trim();
                String mobile=mob.getText().toString();

                if(nam.equals("")){
                    Toast.makeText(getApplicationContext(), "Please Enter the name", Toast.LENGTH_SHORT).show();
                }
                if(mobile.length()>10 || mobile.length()!=10){
                    Toast.makeText(getApplicationContext(),"Not a valid Mobile number",Toast.LENGTH_SHORT).show();
                }
                if (check.equals("") || cpass.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter the Password", Toast.LENGTH_SHORT).show();
                }
                if(em.equals("")){
                    Toast.makeText(getApplicationContext(), "Please enter the Email-Id", Toast.LENGTH_SHORT).show();
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(em).matches()){
                    Toast.makeText(getApplicationContext(), "Please enter correct email id", Toast.LENGTH_SHORT).show();
                }
                if(!check.equals(cpass)){
                    Toast.makeText(getApplicationContext(),"Password does not match",Toast.LENGTH_SHORT).show();
                }

                //registration
                progres.setVisibility(View.VISIBLE);


                mAuth.createUserWithEmailAndPassword(em,cpass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progres.setVisibility(View.GONE);
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Successfull", Toast.LENGTH_SHORT).show();
                            Intent i=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i);
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                        }
                    }

                        });
                }

        });
    }
@Override
    protected void onStart(){
        super.onStart();
        mAuth.addAuthStateListener(authStateListener);
}
}
