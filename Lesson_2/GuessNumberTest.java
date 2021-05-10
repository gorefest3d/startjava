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

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo, targetNumber);
        boolean isContinue = false;

        do {
            guessNumber.playGame();
            String nextToDo;
            
            do {
                System.out.print("Хотите поиграть еще? [yes/no]: ");
                nextToDo = scan.nextLine();

                if (nextToDo.equals("yes")) {
                    isContinue = true;
                } else if (nextToDo.equals("no")) {
                    isContinue = false;
                }
            } while (!nextToDo.equals("yes") && !nextToDo.equals("no"));
        } while (isContinue);
    }
}