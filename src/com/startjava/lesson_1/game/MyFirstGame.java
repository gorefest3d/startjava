package com.startjava.lesson_1.game;

import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        int targetNumber = 80;
        int playerNumber = 0;

        Random randomNumber = new Random();

        do {
            if (playerNumber < targetNumber) {
                System.out.println("Данное число меньше того, что загадал компьютер ");
            } else {
                System.out.println("Данное число больше того, что загадал компьютер ");
            }
            playerNumber = randomNumber.nextInt(101);
        } while (playerNumber != targetNumber);

        System.out.println("Поздравляю, число угадано!");
    }
}