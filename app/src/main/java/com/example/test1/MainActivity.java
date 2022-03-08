package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText num1 = findViewById(R.id.editTextTextPersonName);
        EditText num2 = findViewById(R.id.editTextTextPersonName2);

        Button cal = findViewById(R.id.button);
        TextView total = findViewById(R.id.A);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int x = a+b ;
                System.out.println("///"+x);
                total.setText(x + "");
            }
        });
    }
}