package ie.gmit;

public class Calculator {
    private double firstNumber;
    private double secondNumber;

    public Calculator(){
        this.firstNumber = 0.00;
        this.secondNumber = 0.00;
    }

    public Calculator(double firstNumber, double secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double add(double number1, double number2){
        double result = number1 + number2;
        return result;
    }

}
