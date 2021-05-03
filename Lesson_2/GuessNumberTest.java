import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        
        Random randomNumber = new Random();
        int targetNumber = randomNumber.nextInt(101);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine());
        
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine());

        GuessNumber guessNumber = new GuessNumber();
        boolean isChangePlayer = false;

        do {
            System.out.print(playerOne.getPlayerName() + ", введите число: ");
            playerOne.setNumber(scan.nextInt());
            guessNumber.playGame(playerOne, targetNumber);
            isChangePlayer = guessNumber.isChanged;

            if (isChangePlayer) {
                System.out.print(playerTwo.getPlayerName() + ", введите число: ");
                playerTwo.setNumber(scan.nextInt());
                guessNumber.playGame(playerTwo, targetNumber);
                isChangePlayer = guessNumber.isChanged;
            }

            if (!isChangePlayer) {
                boolean isRightChoice = true;
                scan.nextLine();
                do {
                    System.out.print("Хотите поиграть еще? [yes/no]: ");
                    String nextToDo = scan.nextLine();

                    if (nextToDo.equals("yes")) {
                    isChangePlayer = true;
                    isRightChoice = true;
                    } else if (nextToDo.equals("no")) {
                    isChangePlayer = false;
                    isRightChoice = true;
                    } else {
                    isRightChoice = false;
                    }
                }while (!isRightChoice);
            }
        } while(isChangePlayer);
    }
}