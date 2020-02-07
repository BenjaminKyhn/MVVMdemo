package com.example.mvvmdemo.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmdemo.Model.Model;
import com.example.mvvmdemo.R;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {

    private TextView mainText;
    private EditText mainEditText;
    private Button mainButton;

    Model ot = new Model(); //ot = observable text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.mainText);
        mainEditText = findViewById(R.id.mainEditText);
        mainButton = findViewById(R.id.mainButton);

        ot.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                mainText.setText(arg.toString());
            }
        });
    }

    public void showText(View view){
        ot.setInputText(mainEditText.getText().toString());
    }
}


