public class Calculator {

    private int number1;
    private int number2;
//    private int sum;

    public Calculator(int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int add() {
        return (this.number1 + this.number2);
    }

    public int subtract() {
        return (this.number1 - this.number2);
    }

    public int multiply() {
        return (this.number1 * this.number2);
    }

    public int divide() {
        return (this.number1 / this.number2);
    }
}
