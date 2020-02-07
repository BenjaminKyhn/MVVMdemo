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

public class AndroidView extends AppCompatActivity {

    private TextView mainText;
    private EditText mainEditText;
    private Button mainButton;
    private TextView secondText;

    Model ot = new Model(); //ot = observable text

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainText = findViewById(R.id.mainText);
        mainEditText = findViewById(R.id.mainEditText);
        mainButton = findViewById(R.id.mainButton);
        secondText = findViewById(R.id.secondText);

        final LowerCasePresenter viewModel = new LowerCasePresenter();

        ot.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                mainText.setText(arg.toString());
                secondText.setText(viewModel.uncapitalize(arg.toString()));
            }
        });
    }

    public void showText(View view){
        ot.setInputText(mainEditText.getText().toString());
    }
}


