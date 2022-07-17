package com.example.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculate extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);
        //inflate
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        TextView sum = findViewById(R.id.sum);
        Button btn_sum= findViewById(R.id.btn_sum);


       btn_sum.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String n1 = num1.getText().toString();
               String n2 = num2.getText().toString();

               int number1 =Integer.parseInt(n1);
               int number2 =Integer.parseInt(n2);

               int result = number1 + number2 ;
               sum.setText("Result" +"  "+ result);

           }
       });
    }
}