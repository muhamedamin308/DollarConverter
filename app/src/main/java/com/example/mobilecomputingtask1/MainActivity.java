package com.example.mobilecomputingtask1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
            if (dollar.getText().toString().isEmpty()) {
                Toast.makeText(this, "Invalid Data - Try Again", Toast.LENGTH_SHORT).show();
            } else {
                double egyptian = Converter.convertToEgyptian(Double.parseDouble(dollar.getText().toString()));
                TextView egyptianPound = findViewById(R.id.egyptianValue);
                String finalValue = new DecimalFormat("##.##").format(egyptian) + " L.E";
                egyptianPound.setText(finalValue);
            }
        });
        clear.setOnClickListener(v -> {
            EditText dollar = findViewById(R.id.dollarValue);
            TextView egyptian = findViewById(R.id.egyptianValue);
            dollar.setText("");
            egyptian.setText("00.00 L.E");
        });
    }
}