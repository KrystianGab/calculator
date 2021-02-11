package ie.gmit;

public class Calculator {
    private int firstNumber;
    private int secondNumber;

    public Calculator(){
        this.firstNumber = 0;
        this.secondNumber = 0;
    }

    public Calculator(int firstNumber, int secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public int add(int number1, int number2){
        int equals = number1 + number2;
        return equals;
    }
}
