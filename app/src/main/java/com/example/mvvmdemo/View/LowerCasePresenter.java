package com.example.mvvmdemo.View;

import java.util.Observable;
import java.util.Observer;

public class LowerCasePresenter implements Observer {
    String uncappedString = "";

    @Override
    public void update(Observable o, Object arg) {
        uncapitalize(arg.toString());
    }

    public void uncapitalize(String string) {
        uncappedString = string.toLowerCase();
    }

    public String getUncappedString() {
        return uncappedString;
    }
}
