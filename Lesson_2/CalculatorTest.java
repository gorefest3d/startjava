import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        
        boolean nextOperation = true;
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
    
        do {
            System.out.print("Введите первое число: ");
            int numberOne = scan.nextInt();
            calculator.setNumberOne(numberOne);

            System.out.print("Введите знак математической операции: ");
            char operation = scan.next().charAt(0);
            calculator.setOperation(operation);

            System.out.print("Введите второе число: ");
            int numberTwo = scan.nextInt();
            calculator.setNumberTwo(numberTwo);

            calculator.calculate();
            scan.nextLine();
            boolean choice = true;

            do{
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                String nextToDo = scan.nextLine();

                if (nextToDo.equals("yes")) {
                    nextOperation = true;
                    choice = true;
                } else if (nextToDo.equals("no")) {
                    nextOperation = false;
                    choice = true;
                } else {
                    choice = false;
                }
            } while (!choice);
        } while (nextOperation);
    }
}