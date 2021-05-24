package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    public double calculate(String mathExpression) {
        String[] operands = mathExpression.split(" ");
        int firstOperand = Integer.parseInt(operands[0]);
        int secondOperand = Integer.parseInt(operands[2]);
        String expression = operands[1];
        //double result = 0;

        switch (expression) {
            case "+" :
                return firstOperand + secondOperand;
            case "-" :
                return firstOperand - secondOperand;
            case "*" :
                return firstOperand * secondOperand;
            case "/" :
                return (firstOperand * 1.0) / secondOperand;
            case "^" :
                return Math.pow((firstOperand), secondOperand);
            case "%" :
                return firstOperand % secondOperand;
        }
        return 0.0;
    }
}