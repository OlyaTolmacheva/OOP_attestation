package model;

public abstract class Calculation {
    Calculator calculator = new Calculator();
    private double result = 0;

    public double getResult() {
        return result;
    }
    public double getResult(double number1, double number2, String operation) {
        switch (operation) {
            case "+":
                calculator.setOperation(new Sum());
                this.result = calculator.calculate(number1, number2);
                break;
            case "*":
                calculator.setOperation(new Multiply());
                this.result = calculator.calculate(number1, number2);
                break;
            case "/":
                if (number2 != 0) {
                    calculator.setOperation(new Divide());
                    this.result = calculator.calculate(number1, number2);
                } else {
                    System.out.println("Делить на 0 нельзя!");
                    return 0;
                }
        }
        return this.result;
    }
}
