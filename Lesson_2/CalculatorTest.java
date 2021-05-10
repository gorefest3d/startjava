import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        
        boolean isContinue = false;
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
            String nextToDo;

            do{
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
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