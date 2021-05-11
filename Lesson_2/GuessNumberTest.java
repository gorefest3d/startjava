import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Введите имя первого игрока: ");
        Player playerOne = new Player(scan.nextLine());
        
        System.out.print("Введите имя второго игрока: ");
        Player playerTwo = new Player(scan.nextLine());

        GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);
        String nextToDo;

        do {
            guessNumber.playGame();
            do {
                System.out.print("Хотите поиграть еще? [yes/no]: ");
                nextToDo = scan.nextLine();
            } while (!nextToDo.equals("yes") && !nextToDo.equals("no"));
        } while (nextToDo.equals("yes") && !nextToDo.equals("no"));
    }
}