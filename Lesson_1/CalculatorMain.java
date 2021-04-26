public class CalculatorMain {
    public static void main(String[] args) {
    int numberOne = 10;
    int numberTwo = 3;
    char operation = '/';

    if (operation == '+') {
            System.out.println(numberOne + numberTwo);
        } else if (operation == '-') {
            System.out.println(numberOne - numberTwo);
        } else if (operation == '*') {
            System.out.println(numberOne * numberTwo);
        } else if (operation == '/') {
            System.out.println((numberOne * 1.0) / numberTwo);
        } else if (operation == '^') {
            int result = 1;
                for (int i = 1; i <= numberTwo; i++) {
                    result *= numberOne;
                }
            System.out.println(result);
        } else if (operation == '%') {
            System.out.println(numberOne % numberTwo);
        }
    }
}