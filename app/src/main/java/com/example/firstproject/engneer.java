package com.example.firstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class engneer extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engneer);

        Spinner spe = findViewById(R.id.shapes);
        EditText height_req = findViewById(R.id.h_req);
        EditText width_req = findViewById(R.id.w_req);
        EditText redius = findViewById(R.id.r_circle);
        EditText height_moth = findViewById(R.id.h_moth);
        EditText width_moth = findViewById(R.id.w_moth);
        TextView total = findViewById(R.id.totals);
        Button calculate = findViewById(R.id.btn_calculates);



        spe.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {

                    case 0:
                        height_req.setVisibility(View.GONE);
                        width_req.setVisibility(View.GONE);
                        redius.setVisibility(View.GONE);
                        height_moth.setVisibility(View.GONE);
                        width_moth.setVisibility(View.GONE);
                        break;
                    case 1:
                        height_req.setVisibility(View.VISIBLE);
                        width_req.setVisibility(View.VISIBLE);
                        redius.setVisibility(View.GONE);
                        height_moth.setVisibility(View.GONE);
                        width_moth.setVisibility(View.GONE);
                        break;
                    case 2:
                        height_req.setVisibility(View.GONE);
                        width_req.setVisibility(View.GONE);
                        redius.setVisibility(View.VISIBLE);
                        height_moth.setVisibility(View.GONE);
                        width_moth.setVisibility(View.GONE);
                        break;
                    case 3:
                        height_req.setVisibility(View.GONE);
                        width_req.setVisibility(View.GONE);
                        redius.setVisibility(View.GONE);
                        height_moth.setVisibility(View.VISIBLE);
                        width_moth.setVisibility(View.VISIBLE);
                        break;

                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index = spe.getSelectedItemPosition();
                double area = 0;
                switch (index) {

                    case 1:

                        String H_req = height_req.getText().toString();
                        double h_req = Double.parseDouble(H_req);

                        String W_req = width_req.getText().toString();
                        double w_req = Double.parseDouble(W_req);

                        area = w_req * h_req;


                        break;
                    case 2:

                        String reduiss = redius.getText().toString();
                        double r_rad = Double.parseDouble(reduiss);
                        area =Math.PI * Math.pow(r_rad,2) ;

                        break;
                    case 3:

                        String H_moth = height_moth.getText().toString();
                        int h_moth = Integer.parseInt(H_moth);

                        String W_moth = width_moth.getText().toString();
                        int w_moth = Integer.parseInt(W_moth);

                        area = 0.5 * (w_moth * h_moth);


                        break;

                }
                total.setText(area + "");
            }
        });

    }

    // reduse  pi*r*r
    // rectangle h*w
    // mothalt 0.5 * h*w


}