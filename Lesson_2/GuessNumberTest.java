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

        do {
            guessNumber.playGame(playerOne, playerTwo, targetNumber);
            boolean isRightChoice = true;
            
            do {
                System.out.print("Хотите поиграть еще? [yes/no]: ");
                String nextToDo = scan.nextLine();

                if (nextToDo.equals("yes")) {
                    guessNumber.isChanged = false;
                    isRightChoice = true;
                } else if (nextToDo.equals("no")) {
                    guessNumber.isChanged = true;
                    isRightChoice = true;
                } else {
                    isRightChoice = false;
                }
            } while (!isRightChoice);
        } while (!guessNumber.isChanged);
    }
}