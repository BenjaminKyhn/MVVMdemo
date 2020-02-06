package com.example.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mainText;
    EditText mainEditText;
    Button mainButton;
    String textInput = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.mainText);
        mainEditText = findViewById(R.id.mainEditText);
        mainButton = findViewById(R.id.mainButton);
    }

    public void showText(View view){
        textInput = mainEditText.getText().toString();
        mainText.setText(textInput);
    }
}
