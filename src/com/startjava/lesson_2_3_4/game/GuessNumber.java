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
        int targetNumber = randomNumber.nextInt(101);
        int tryCount = 0;

        while (!makeMove(first, targetNumber) && !makeMove(second, targetNumber)) {
            System.out.println("Попытка " + (tryCount + 2));
            tryCount++;
        }
        showPlayerNumbers(first);
        showPlayerNumbers(second);
    }

    private boolean makeMove(Player player, int targetNumber) {
        inputNumber(player);
        if (player.getCount() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return true;
        }
            return compareNumbers(player, targetNumber);

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
        return false;
    }

    private void showPlayerNumbers(Player player) {
        for (int number : player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}