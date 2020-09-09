package com.example.search_engine;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class resetpass extends AppCompatActivity {
    TextView mess;
    EditText emailid;
    Button resetpass;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpass);
        mess=findViewById(R.id.textView9);
        emailid=findViewById(R.id.editText);
        resetpass=findViewById(R.id.reset);
        firebaseAuth=FirebaseAuth.getInstance();

        resetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String useremail=emailid.getText().toString().trim();

                if(useremail.equals("")){
                    Toast.makeText(getApplicationContext(),"Please provide your registered Email-Id",Toast.LENGTH_SHORT).show();
                }
                else{
                    firebaseAuth.sendPasswordResetEmail(useremail).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                          if(task.isSuccessful()){
                              Toast.makeText(getApplicationContext(),"Password link has been sent",Toast.LENGTH_SHORT).show();
                              Intent i=new Intent(getApplicationContext(),MainActivity.class);
                              startActivity(i);
                          }
                          else{
                              Toast.makeText(getApplicationContext(),"Error "+task.getException().getMessage(),Toast.LENGTH_SHORT).show();
                          }
                        }
                    });

                }
            }
        });
    }
}
