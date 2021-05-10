import java.util.Scanner;

public class GuessNumber {
    
    public boolean compareNumbers;
    public Player first;
    public Player second;
    public int targetNumber;
    Scanner scan = new Scanner(System.in);

    public GuessNumber(Player first, Player second, int targetNumber) {
        this.first = first;
        this.second = second;
        this.targetNumber = targetNumber;
    }

    public void playGame() {
        do {
            System.out.print(first.getName() + ", введите число: ");
            first.setNumber(scan.nextInt());
            compareNumbers(first, targetNumber);

            if (!compareNumbers) {
                System.out.print(second.getName() + ", введите число: ");
                second.setNumber(scan.nextInt());
                compareNumbers(second, targetNumber);
            }
        } while (!compareNumbers);
    }

    public void compareNumbers(Player player, int targetNumber) {
        if (player.getNumber() == targetNumber) {
            System.out.println(player.getName() + " , поздравляю, число угадано!");
            compareNumbers = true;
        } else if (player.getNumber() < targetNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            compareNumbers = false;
        } else if (player.getNumber() > targetNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            compareNumbers = false;
        }
    }
}