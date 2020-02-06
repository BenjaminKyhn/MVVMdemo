package com.example.mvvmdemo.Model;

import java.util.Observable;

public class Model extends Observable {
    private String inputText;

    public void setInputText(String inputText){
        this.inputText = inputText;
        setChanged();
        notifyObservers(inputText);
    }
}
