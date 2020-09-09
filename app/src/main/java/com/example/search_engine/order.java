package com.example.search_engine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class order extends AppCompatActivity {
    private static final int PERMISSION_CODE = 1000;
    private static final int IMAGE_CAPTURE_CODE = 1001;
    TextView t1, t2, t3, t4, t5, t6, t7;
    EditText e1, e2, e3, e4, e5;
    Button b1, btn;
    ImageView imageView;
    Integer REQUEST_CAMERA = 1, SELECT_FILE = 0;
    //Uri image_uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent i = this.getIntent();
        t1 = findViewById(R.id.txt);
        t2 = findViewById(R.id.txt1);
        t3 = findViewById(R.id.txt2);
        t4 = findViewById(R.id.txt3);
        t5 = findViewById(R.id.txt4);
        t6 = findViewById(R.id.txt5);
        t7 = findViewById(R.id.txt6);
        e1 = findViewById(R.id.etxt1);
        e2 = findViewById(R.id.etxt2);
        e3 = findViewById(R.id.etxt3);
        e4 = findViewById(R.id.etxt4);
        e5 = findViewById(R.id.etxt5);
        b1 = findViewById(R.id.button);
        btn = findViewById(R.id.button2);
        imageView = findViewById(R.id.imageView7);


        //for adding image
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SelectImage();

                /*if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (checkSelfPermission(Manifest.permission.CAMERA) ==
                            PackageManager.PERMISSION_DENIED || checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) ==
                            PackageManager.PERMISSION_DENIED) {
                        String permission[] = {Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE};
                        requestPermissions(permission, PERMISSION_CODE);
                    } else {
                        openCamera();
                    }
                }
                else{
                    openCamera();
                }*/
            }
        });
        btn.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                String name = e1.getText().toString();
                String Mobile = e2.getText().toString();
                String Pincode = e3.getText().toString();
                String Address = e4.getText().toString();
                String Landmark = e5.getText().toString();
                if (name.equals("") || Mobile.equals(" ") || Pincode.equals("") || Address.equals("") || Landmark.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please provide the details for delivery", Toast.LENGTH_SHORT).show();
                } else if (name.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please enter the name", Toast.LENGTH_SHORT).show();
                } else if (Mobile.length() > 10 || Mobile.length() != 10) {
                    Toast.makeText(getApplicationContext(), "Not a valid Mobile number", Toast.LENGTH_SHORT).show();
                } else if (Pincode.length() > 6 || Pincode.length() != 6) {
                    Toast.makeText(getApplicationContext(), "Not a valid pincode", Toast.LENGTH_SHORT).show();
                } else if (Address.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please provide the address", Toast.LENGTH_SHORT).show();
                } else if (Landmark.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please provide landmark for delivery", Toast.LENGTH_SHORT).show();
                }
                if (b1.equals("")) {
                    Toast.makeText(getApplicationContext(), "Please Upload the prescription", Toast.LENGTH_SHORT).show();
                } else {
                    Intent i = new Intent(getApplicationContext(), thankyou.class);
                    i.putExtra("nm", name);
                    i.putExtra("mob", Mobile);
                    i.putExtra("pin", Pincode);
                    i.putExtra("add", Address);
                    i.putExtra("land", Landmark);
                    startActivity(i);
                }
            }
        });

    }

    private void SelectImage() {

        final CharSequence[] items = {"Camera", "Gallery", "Cancel"};
        AlertDialog.Builder builder = new AlertDialog.Builder(order.this);
        builder.setTitle("Upload Image From");
        builder.setItems(items, new DialogInterface.OnClickListener() {
            @SuppressLint("IntentReset")
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (items[which].equals("Camera")) {
                    Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                    startActivityForResult(intent, REQUEST_CAMERA);
                } else if (items[which].equals("Gallery")) {
                    Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                    intent.setType("image/*");
                    startActivityForResult(intent.createChooser(intent, "Select File"), SELECT_FILE);
                } else if (items[which].equals("Cancel")) {
                    dialog.dismiss();
                }
            }
        });
        builder.show();
    }

    @Override
    public void onActivityResult(int requestCode, int resultcode, Intent data) {
        super.onActivityResult(requestCode, resultcode, data);
        if (requestCode == Activity.RESULT_OK) {
            if (requestCode == REQUEST_CAMERA) {
                Bundle bundle = data.getExtras();
                final Bitmap bmp = (Bitmap) bundle.get("data");
                imageView.setImageBitmap(bmp);

            } else if (requestCode == SELECT_FILE) {
                Uri selectedImageUri = data.getData();
                imageView.setImageURI(selectedImageUri);
            }
        }
    }



    /*private void openCamera(){
        ContentValues values=new ContentValues();
        values.put(MediaStore.Images.Media.TITLE,"New Picture");
        values.put(MediaStore.Images.Media.DESCRIPTION,"From the camera");
        image_uri=getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI,values);

        Intent cameraIntent= new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT,image_uri);
        startActivityForResult(cameraIntent,IMAGE_CAPTURE_CODE);


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case PERMISSION_CODE:{
                if(grantResults.length > 0 && grantResults[0]==PackageManager.PERMISSION_GRANTED){
                    openCamera();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Permission Denied", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        if (resultCode == RESULT_OK) {
            imageView.setImageURI(image_uri);
        }
*/


}



