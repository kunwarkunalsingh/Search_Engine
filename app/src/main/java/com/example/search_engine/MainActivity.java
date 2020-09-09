package com.example.search_engine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class MainActivity extends AppCompatActivity {
TextView t1,t2,t3,t4,forget;
EditText e1,e2;
Button b1,b2;
FirebaseAuth fAuth;
ProgressBar progres;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.txt);
        t2=findViewById(R.id.txt1);
        t3=findViewById(R.id.t2);
        t4=findViewById(R.id.txt3);
        e1=findViewById(R.id.etxt1);
        e2=findViewById(R.id.etxt2);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.b2);
        forget=findViewById(R.id.rpass);
        progres=findViewById(R.id.progressBar);
        fAuth=FirebaseAuth.getInstance();

               b1.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       String usr=e1.getText().toString();
                       String pass=e2.getText().toString();

                       if(usr.equals("")){
                           Toast.makeText(getApplicationContext(), "Please enter the Username", Toast.LENGTH_SHORT).show();
                       }
                       if (pass.equals("")){
                           Toast.makeText(getApplicationContext(), "Please enter the Password", Toast.LENGTH_SHORT).show();
                       }
                       if(usr.equals("") || pass.equals("")){
                           Toast.makeText(getApplicationContext(), "Please enter the Username and Password", Toast.LENGTH_SHORT).show();
                       }
                       if(!Patterns.EMAIL_ADDRESS.matcher(usr).matches()){
                           Toast.makeText(getApplicationContext(), "Please enter correct email id", Toast.LENGTH_SHORT).show();
                       }
                       progres.setVisibility(View.VISIBLE);

                       fAuth.signInWithEmailAndPassword(usr,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                           @Override
                           public void onComplete(@NonNull Task<AuthResult> task) {
                               progres.setVisibility(View.GONE);
                            if (task.isSuccessful()){
                                Toast.makeText(MainActivity.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();
                                Intent i=new Intent(getApplicationContext(),complete.class);
                                startActivity(i);
                            }
                            else{
                                    Toast.makeText(MainActivity.this, "Unsuccessfully" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }

                           }
                       });
                   }

               });
               b2.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent i=new Intent(getApplicationContext(),register.class);
                       startActivity(i);
                       finish();
                   }
               });
               forget.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent i=new Intent(getApplicationContext(),resetpass.class);
                       startActivity(i);
                   }
               });
    }
}
