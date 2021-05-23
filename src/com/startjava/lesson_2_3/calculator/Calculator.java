package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public double calculate(String userData) {
        String[] words = userData.split(" ");
        double result = 0;

        switch (words[1]) {
            case "+" :
                result = Integer.parseInt(words[0]) + Integer.parseInt(words[2]);
                break;
            case "-" :
                result = Integer.parseInt(words[0]) - Integer.parseInt(words[2]);
                break;
            case "*" :
                result = Integer.parseInt(words[0]) * Integer.parseInt(words[2]);
                break;
            case "/" :
                result = ((Integer.parseInt(words[0]) * 1.0) / Integer.parseInt(words[2]));
                break;
            case "^" :
                result = Math.pow(Integer.parseInt(words[0]), Integer.parseInt(words[2]));
                break;
            case "%" :
                result = Integer.parseInt(words[0]) % Integer.parseInt(words[2]);
                break;
        }
        return result;
    }
}