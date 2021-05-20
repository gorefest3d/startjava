package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String playerAnswer;
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
    
        do {
            System.out.print("Введите первое число: ");
            int numberOne = scan.nextInt();
            calculator.setNumberOne(numberOne);

            System.out.print("Введите знак математической операции: ");
            char operation = scan.next().charAt(0);
            calculator.setOperation(operation);

            System.out.print("Введите второе число: ");
            int numberTwo = scan.nextInt();


            calculator.setNumberTwo(numberTwo);

            calculator.calculate();
            scan.nextLine();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        } while (playerAnswer.equals("yes"));
    }
}