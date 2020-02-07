package com.example.mvvmdemo.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmdemo.Model.Model;
import com.example.mvvmdemo.R;

public class AndroidView extends AppCompatActivity {

    private TextView mainText;
    private EditText mainEditText;
    private Button mainButton;
    private TextView secondText;
    private LowerCasePresenter lowerCasePresenter = new LowerCasePresenter();
    private Model model = new Model(); //model = observable text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.mainText);
        mainEditText = findViewById(R.id.mainEditText);
        mainButton = findViewById(R.id.mainButton);
        secondText = findViewById(R.id.secondText);

        model.addObserver(lowerCasePresenter);
    }

    public void showText(View view){
        model.setInputText(mainEditText.getText().toString());
        mainText.setText(lowerCasePresenter.getUncappedString());
        secondText.setText(mainEditText.getText().toString());
    }
}


