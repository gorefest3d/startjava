public class GuessNumber {
    
    public boolean isChanged = false;

    public void playGame(Player playerThis, int targetNumber) {
        if (playerThis.getNumber() == targetNumber) {
            System.out.println(playerThis.getPlayerName() + " , поздравляю, число угадано!");
            isChanged = false;
        } else if (playerThis.getNumber() < targetNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
            isChanged = true;
        } else if (playerThis.getNumber() > targetNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
            isChanged = true;
        }
    }
}