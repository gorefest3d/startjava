import java.util.Random;

public class MyFirstGame {
    public static void main(String[] args) {
        int number = 80;
        int gamerNumber = 0;

        Random randomNumber = new Random();

        do {
            if (gamerNumber < number) {
                System.out.println("Данное число меньше того, что загадал компьютер ");
            } else {
                System.out.println("Данное число больше того, что загадал компьютер ");
            }
            gamerNumber = randomNumber.nextInt(101);
        } while (gamerNumber != number);

        System.out.println("Поздравляю, число угадано!");
    }
}