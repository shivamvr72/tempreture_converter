package com.example.tempretureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn1);
        EditText e1 = findViewById(R.id.ed1);
        TextView ans = findViewById(R.id.txt2fh);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s1 =  e1.getText().toString();
                if(!s1.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Converting", Toast.LENGTH_SHORT).show();
                    double cl = Double.parseDouble(s1);
                    double fh = (cl * 9 / 5) + 32;
                    String sfh = Double.toString(fh);
                    String ferenhiet = "Ferenhiet " + sfh;
                    ans.setText(ferenhiet);
                }else{
                    Toast.makeText(getApplicationContext(), "Enter Celcius", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}