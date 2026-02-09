package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText inputTemp;
    Button btnCtoF, btnFtoC;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTemp = findViewById(R.id.inputtemp);
        btnCtoF = findViewById(R.id.btnCtoF);
        btnFtoC = findViewById(R.id.btnFtoC);
        resultText = findViewById(R.id.resultText);

        btnCtoF.setOnClickListener(v -> {
            if (inputTemp.getText().toString().isEmpty()) {
                Toast.makeText(this, "Enter a value", Toast.LENGTH_SHORT).show();
                return;
            }
            double c = Double.parseDouble(inputTemp.getText().toString());
            double f = (c * 9 / 5) + 32;
            resultText.setText("Result: " + f + " °F");
        });

        btnFtoC.setOnClickListener(v -> {
            if (inputTemp.getText().toString().isEmpty()) {
                Toast.makeText(this, "Enter a value", Toast.LENGTH_SHORT).show();
                return;
            }
            double f = Double.parseDouble(inputTemp.getText().toString());
            double c = (f - 32) * 5 / 9;
            resultText.setText("Result: " + c + " °C");
        });
    }
}