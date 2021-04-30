public class Calculator {

    private int numberOne;
    private int numberTwo;
    private char operation;

    public void setNumberOne(int numberOne){
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void calculate(){
        switch(operation) {
            case '+' :
                System.out.println(numberOne + numberTwo);
                break;
            case '-' :
                System.out.println(numberOne - numberTwo);
                break;
            case '*' :
                System.out.println(numberOne * numberTwo);
                break;
            case '/' :
                System.out.println((numberOne * 1.0) / numberTwo);
                break;
            case '^' :
                int result = 1;
                for (int i = 1; i <= numberTwo; i++) {
                        result *= numberOne;
                    }
                System.out.println(result);
                break;
            case '%' :
                System.out.println(numberOne % numberTwo);
                break;
        }
    }
}