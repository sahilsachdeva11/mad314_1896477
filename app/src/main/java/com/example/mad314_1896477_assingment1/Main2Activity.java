package com.example.mad314_1896477_assingment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    EditText resultedittext=findViewById(R.id.resultedittext);
    EditText productedittext=findViewById(R.id.productedittext);
    Button button=findViewById(R.id.button);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent2=getIntent();
       String result1= intent2.getStringExtra("result");
        String product1=intent2.getStringExtra("product");
        resultedittext.setText(result1);;
        productedittext.setText(product1);
        final Intent intent1= new Intent(Main2Activity.this,MainActivity.class);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });


    }
}
