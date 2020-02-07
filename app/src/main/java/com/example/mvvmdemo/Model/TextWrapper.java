package com.example.mvvmdemo.Model;

public class TextWrapper {
    public String uncapitalize(String string) {
        String uncappedString = "";
        for (int i = 0; i < string.length(); i++) {
            if (((string.charAt(i) >= 'A') && (string.charAt(i) <= 'Z')) || (string.charAt(i) == 'Æ')  || (string.charAt(i) == 'Ø')  || (string.charAt(i) == 'Å')) {
                uncappedString += Character.toLowerCase(string.charAt(i));
            }
            else {
                uncappedString += string.charAt(i);
            }
        }
        return uncappedString;
    }
}
