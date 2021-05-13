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
        int targetNumber = randomNumber.nextInt(101);

        do {
            System.out.print(first.getName() + ", введите число: ");
            first.setNumber(scan.nextInt());
            if (!compareNumbers(first, targetNumber)) {
                System.out.print(second.getName() + ", введите число: ");
                second.setNumber(scan.nextInt());
            }
        } while (!compareNumbers(second, targetNumber));
    }

    public boolean compareNumbers(Player player, int targetNumber) {
        if (player.getNumber() == targetNumber) {
            System.out.println(player.getName() + " , поздравляю, число угадано!");
            return true;
        } else if (player.getNumber() < targetNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else if (player.getNumber() > targetNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        }
        return false;
    }
}