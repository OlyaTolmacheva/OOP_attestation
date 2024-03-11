package model;

import model.Operation;

public class Sum implements Operation {
    @Override
    public double calculate(double number1, double number2) {
        return number1 + number2;
    }
}
