package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public Player first;
    public Player second;
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player first, Player second) {
        this.first = first;
        this.second = second;
    }

    public void playGame() {
        first.clearNumbers();
        second.clearNumbers();
        Random randomNumber = new Random();
        //int targetNumber = randomNumber.nextInt(101);
        int targetNumber = 20;
        int tryCount = 0;

        while (tryCount < 10) {
            inputNumber(first);
            if (compareNumbers(first, targetNumber)) {
                break;
            }
            inputNumber(second);
            if (compareNumbers(second, targetNumber)) {
                break;
            }
            tryCount++;
        }
        showPlayerNumbers(first);
        showPlayerNumbers(second);
    }

    private void inputNumber(Player player) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player, int targetNumber) {
        if (player.getNumber() == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " с " + player.getCount() + " попытки");
            return true;
        }

        String answer = player.getNumber() < targetNumber ? "меньше" : "больше";
        System.out.println("Данное число " + answer + " того, что загадал компьютер");

        if (player.getCount() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }

    private void showPlayerNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}