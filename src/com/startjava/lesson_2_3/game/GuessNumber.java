package com.startjava.lesson_2_3.game;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public Player first;
    public Player second;
    Random randomNumber = new Random();
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player first, Player second) {
        this.first = first;
        this.second = second;
    }

    public void playGame() {
        first.clearNumbers();
        second.clearNumbers();
        //int targetNumber = randomNumber.nextInt(101);
        int targetNumber = 20;
        int tryCount = 0;

        while (tryCount < 10) {
            playerInput(first, tryCount);
            if (compareNumbers(first, targetNumber)) {
                break;
            }
            playerInput(second, tryCount);
            if (compareNumbers(second, targetNumber)) {
                break;
            }
            tryCount++;
        }
        System.out.println(first.getNumbers());
        System.out.println(second.getNumbers());
    }

    public boolean compareNumbers(Player player, int targetNumber) {
        if (player.getNumber() == targetNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + targetNumber + " с " + player.getCount() + " попытки");
            return true;
        } else if (player.getNumber() < targetNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (player.getNumber() > targetNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        }
        if (player.getCount() == 10) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
        }
        return false;
    }

    public void playerInput(Player player, int tryCount) {
        System.out.print(player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt(), tryCount);
    }
}
