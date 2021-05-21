package com.startjava.lesson_2_3.calculator;

public class Calculator {
    public void calculate(String userData) {
        String[] words = userData.split(" ");

        switch (words[1]) {
            case "+" -> System.out.println(Integer.parseInt(words[0]) + Integer.parseInt(words[2]));
            case "-" -> System.out.println(Integer.parseInt(words[0]) - Integer.parseInt(words[2]));
            case "*" -> System.out.println(Integer.parseInt(words[0]) * Integer.parseInt(words[2]));
            case "/" -> System.out.println((Integer.parseInt(words[0]) * 1.0) / Integer.parseInt(words[2]));
            case "^" -> {
                int result = 1;
                for (int i = 1; i <= Integer.parseInt(words[2]); i++) {
                    result *= Integer.parseInt(words[0]);
                }
                System.out.println(result);
            }
            case "%" -> System.out.println(Integer.parseInt(words[0]) % Integer.parseInt(words[2]));
        }
    }
}