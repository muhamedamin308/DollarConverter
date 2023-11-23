package com.example.mobilecomputingtask1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button convertor = findViewById(R.id.convert);
        Button clear = findViewById(R.id.clear);
        convertor.setOnClickListener(v -> {
            EditText dollar = findViewById(R.id.dollarValue);
            EditText pound = findViewById(R.id.egyptianValue);
            if (!(dollar.getText().toString().isEmpty())) {
                double egyptian = Converter.convertToEgyptian(Double.parseDouble(dollar.getText().toString()));
                String finalValue = new DecimalFormat("##.##").format(egyptian);
                pound.setText(finalValue);
            } else if (!(pound.getText().toString().isEmpty())) {
                double usDollar = Converter.convertToDollar(Double.parseDouble(pound.getText().toString()));
                String finalValue = new DecimalFormat("##.##").format(usDollar);
                dollar.setText(finalValue);
            } else {
                Toast.makeText(this, "Invalid Data - Try Again", Toast.LENGTH_SHORT).show();
            }
        });
        clear.setOnClickListener(v -> {
            EditText dollar = findViewById(R.id.dollarValue);
            @SuppressLint("CutPasteId") TextView egyptian = findViewById(R.id.egyptianValue);
            dollar.setText("");
            egyptian.setText("");
        });
    }
}