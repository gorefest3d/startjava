public class Cycle {
    
    public static void main(String[] args) {
        
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        int i = 6;
        while (i >= -6) {
            System.out.println(i);
            i-= 2;
        }

        int j = 10;
        int summa = 0;
        do {
            summa = summa + j;
            j++;
        } while (j <= 20);
        System.out.println(summa);
    }
}