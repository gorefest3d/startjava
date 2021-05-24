package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String playerAnswer;
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
    
        do {
            System.out.print("Введите математическое выражение: ");
            String mathExpression = scan.nextLine();
            System.out.println(calculator.calculate(mathExpression));

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        } while (playerAnswer.equals("yes"));
    }
}