package com.example.mathforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.numFlu);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumFlu();
            }
        });

        button2 = (Button) findViewById(R.id.multi);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMulti();
            }
        });

        button3 = (Button) findViewById(R.id.division);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDiv();
            }
        });
    }

    public void openNumFlu() {
        Intent intent = new Intent(this, NumericalFluency.class);
        startActivity(intent);
    }

    public void openMulti() {
        Intent intent = new Intent(this, Multiplication.class);
        startActivity(intent);
    }

    public void openDiv() {
        Intent intent = new Intent(this, Division.class);
        startActivity(intent);
    }
}