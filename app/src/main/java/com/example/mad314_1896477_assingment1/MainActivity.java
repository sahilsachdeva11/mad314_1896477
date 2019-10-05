package com.example.mad314_1896477_assingment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText number1=findViewById(R.id.edittextnum1);
    EditText number2=findViewById(R.id.edittextnum2);
    EditText number3=findViewById(R.id.edittextnum3);
    Button button1=findViewById(R.id.button1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a= Integer.parseInt(number1.getText().toString());
                int b=Integer.parseInt(number2.getText().toString());
                int c=Integer.parseInt(number3.getText().toString());
                String result= String.valueOf(a+b+c);
                String product= String.valueOf(a*b*c);
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("result",result);
                intent.putExtra("product",product);
                startActivity(intent);
            }
        });
    }



}
