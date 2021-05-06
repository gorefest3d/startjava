import java.util.Scanner;

public class GuessNumber {
    
    public boolean isChanged = true;
    Scanner scan = new Scanner(System.in);

    public void playGame(Player first, Player second, int targetNumber) {
        do {
            System.out.print(first.getName() + ", введите число: ");
            first.setNumber(scan.nextInt());
            checkResult(first, targetNumber);

            if (isChanged) {
                System.out.print(second.getName() + ", введите число: ");
                second.setNumber(scan.nextInt());
                checkResult(second, targetNumber);
            }
        } while (isChanged);
    }

    public void checkResult(Player current, int targetNumber) {
        if (current.getNumber() == targetNumber) {
            System.out.println(current.getName() + " , поздравляю, число угадано!");
            isChanged = false;
        } else if (current.getNumber() < targetNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            isChanged = true;
        } else if (current.getNumber() > targetNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            isChanged = true;
        }
    }
}