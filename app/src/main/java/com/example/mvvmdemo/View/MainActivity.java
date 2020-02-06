package com.example.mvvmdemo.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmdemo.Model.ObservableText;
import com.example.mvvmdemo.R;

import java.util.Observable;
import java.util.Observer;

public class MainActivity extends AppCompatActivity {

    public TextView mainText;
    EditText mainEditText;
    Button mainButton;

    ObservableText ot = new ObservableText();
    TextObserver to = new TextObserver();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.mainText);
        mainEditText = findViewById(R.id.mainEditText);
        mainButton = findViewById(R.id.mainButton);

        ot.addObserver(to);
    }

    public void showText(View view){
        ot.setInputText(mainEditText.getText().toString());
    }

    public class TextObserver implements Observer{
        @Override
        public void update(Observable obs, Object obj){
            Log.v("hej", "tommy");
            mainText.setText(obj.toString());
        }
    }
}


