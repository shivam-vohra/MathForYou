package com.example.mathforyou;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NumericalFluency extends AppCompatActivity {

    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numerical_fluency);

        exit = (Button) findViewById(R.id.exitBtn2);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });
    }


    public void goBack() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}