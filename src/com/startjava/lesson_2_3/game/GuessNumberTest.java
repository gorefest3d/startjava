package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine());
        
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine());

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        String playerAnswer;

        do {
            guessNumber.playGame();
            do {
                System.out.print("Хотите поиграть еще? [yes/no]: ");
                playerAnswer = scan.nextLine();
            } while (!playerAnswer.equals("yes") && !playerAnswer.equals("no"));
        } while (playerAnswer.equals("yes") && !playerAnswer.equals("no"));
    }
}