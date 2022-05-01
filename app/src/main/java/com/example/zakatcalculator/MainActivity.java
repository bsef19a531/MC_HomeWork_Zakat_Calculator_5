package com.example.zakatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    EditText amountPanel = findViewById(R.id.amountPanel);
//    TextView resultView = findViewById(R.id.resultTextView);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clearAll(View view)
    {
        TextView resultView = findViewById(R.id.resultTextView);
        EditText amountPanel = findViewById(R.id.amountPanel);

        amountPanel.setText("");
        resultView.setText("");
        resultView.setVisibility(View.GONE);
    }

    public void calculateZakat(View view)
    {
        EditText amountPanel = findViewById(R.id.amountPanel);
        TextView resultView = findViewById(R.id.resultTextView);

        if(String.valueOf(amountPanel.getText()).equals(""))
        {
            return;
        }

        float amount = Float.parseFloat(String.valueOf(amountPanel.getText()));
        resultView.setVisibility(View.VISIBLE);

        if(amount >= 88927)
        {
            amount *= 0.025;
            resultView.setText(  " زکوۃ :" + amount);

        }
        else
        {
            resultView.setText("مال نصاب سے کم ہے۔");
        }

    }
}