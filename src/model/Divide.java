package model;

public class Divide implements Operation {
    @Override
    public double calculate(double number1, double number2) {
        if (number2 == 0) {
            System.out.println("Делить на 0 нельзя");
        }
        return number1 / number2;
    }
}
