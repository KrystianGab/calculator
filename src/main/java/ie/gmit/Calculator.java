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

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int add(int number1, int number2){
        int result = number1 + number2;
        return result;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    @Override
    public  String toString() {return "Result" + add(getFirstNumber(), getSecondNumber());}
}
